package cc.fyp.bmb.controller;

import cc.fyp.bmb.service.BmbService;
import cc.fyp.bmb.service.dto.AttendPlayers;
import cc.fyp.bmb.service.dto.Games;
import cc.fyp.bmb.service.dto.PaticipatePlayers;
import cc.fyp.toy.util.HttpUtils;
import cc.fyp.toy.vo.Results;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "export")
public class ExportController {

    @Autowired
    private BmbService bmbServiceImpl;

    @RequestMapping(value = "show")
    public void showbase(HttpServletRequest request, HttpServletResponse response){

        List<Games> games = bmbServiceImpl.loadGameInfo();
        System.out.println(games);
        for (Games game : games) {
            List<AttendPlayers> players = bmbServiceImpl.loadByGameId(Long.valueOf(game.getId()));
            System.out.println(players);
        }
    }


}
