package cc.fyp.bmb.controller;

import cc.fyp.bmb.service.BmbService;
import cc.fyp.bmb.service.dto.AttendPlayers;
import cc.fyp.bmb.service.dto.Games;
import cc.fyp.bmb.service.dto.PaticipatePlayers;
import cc.fyp.bmb.service.dto.PaylserCountDTO;
import cc.fyp.bmb.service.dto.Players;
import cc.fyp.bmb.service.dto.TeamGamesShowDTO;
import cc.fyp.toy.util.HttpUtils;
import cc.fyp.toy.vo.Results;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "export")
public class ExportController {

    @Autowired
    private BmbService bmbServiceImpl;

    @RequestMapping(value = "show")
    public void showbase(HttpServletRequest request, HttpServletResponse response){

        List<PaylserCountDTO> result = new ArrayList<>();

        List<Players> allUsers = bmbServiceImpl.loadAllPlayers();
        List<Games> games = bmbServiceImpl.loadGameInfo();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Map<String, List<AttendPlayers>> gamesMap = new LinkedHashMap<>();
        for (Games game : games) {
            List<AttendPlayers> players = bmbServiceImpl.loadByGameId(Long.valueOf(game.getId()));
            gamesMap.put(format.format(game.getBeginDate()), players);
        }

        allUsers.stream().forEach(a -> {
            PaylserCountDTO dto = new PaylserCountDTO();
            dto.setUserName(a.getNickName());
            List<TeamGamesShowDTO> showDTOS = new ArrayList<>();
            dto.setInfos(showDTOS);
            BigDecimal d = new BigDecimal(games.size());
            BigDecimal count = BigDecimal.ZERO;
            Integer x = 0;

            for (Map.Entry<String, List<AttendPlayers>> e : gamesMap.entrySet()) {

                TeamGamesShowDTO ts = new TeamGamesShowDTO();
                ts.setBeginDate(e.getKey());
                boolean present = e.getValue().stream().anyMatch(l -> a.getId().equals(l.getId()));
                ts.setPlay(present);
                if (present) {
                    count = count.add(new BigDecimal("1"));
                }
                showDTOS.add(ts);
            }

            dto.setRate(count.divide(d, 2, BigDecimal.ROUND_DOWN).multiply(new BigDecimal("100")));
            result.add(dto);
        });

        List<PaylserCountDTO> sortList = result.stream().sorted(Comparator.comparing(PaylserCountDTO::getRate).reversed()).collect(Collectors.toList());

        sortList.stream().forEach(s -> System.out.println(s.getUserName() + " 出勤率：" + s.getRate().intValue() + "%"));

    }


}
