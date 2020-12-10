package cc.fyp.bmb.service.impl;

import cc.fyp.bmb.service.BmbService;
import cc.fyp.bmb.service.dto.AttendPlayers;
import cc.fyp.bmb.service.dto.Games;
import cc.fyp.bmb.service.dto.Messages;
import cc.fyp.bmb.service.dto.Players;
import cc.fyp.toy.util.HttpUtils;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author von
 * @description:
 * @date 2020/1/8 15:31
 */
@Service
@Slf4j
public class BmbServiceImpl implements BmbService {

    public static String API_GAME_DETAIL = "http://api.snsports.cn/api/content/phone/GetBMGameDetail.json";
    public static String API_GAME_LIST = "http://api.snsports.cn/api/content/phone/GetBMGameListByTeamId.json";
    public static String API_GAME_USERS = "http://api.snsports.cn/api/content/phone/GetBMTeamUserList.json";
    public static String TEAMID = "225834";
    public static String PASS_PORT = "dcwswioo1898l51tvtgzh6x5ifayct35";
    public static String PAGE_SIZE = "10000";

    @Override
    public List<Players> loadAllPlayers() {
        Map<String,String> map = new HashMap<>();
        map.put("teamId",TEAMID);
        String result = HttpUtils.get(API_GAME_USERS, map);
        JSONObject parse = JSONObject.parseObject(result);
        List<Players> players = parse.getJSONObject("messages").getJSONObject("data").getJSONArray("players").toJavaList(Players.class);
        return players;
    }

    @Override
    public List<Games> loadGameInfo() {

        Map<String,String> map = new HashMap<>();
        map.put("teamId",TEAMID);
        map.put("passport",PASS_PORT);
        map.put("pageSize",PAGE_SIZE);
        String result = HttpUtils.get(API_GAME_LIST, map);
        JSONObject parse = JSONObject.parseObject(result);
        Messages msg = parse.getJSONObject("messages").toJavaObject(Messages.class);
        return msg.getData().getGames();
    }

    @Override
    public List<AttendPlayers> loadByGameId(Long gameId) {
        Map<String,String> map = new HashMap<>();
        map.put("teamId",TEAMID);
        map.put("gameId",gameId.toString());
        map.put("passport",PASS_PORT);
        String result = HttpUtils.get(API_GAME_DETAIL, map);
        JSONObject parse = JSONObject.parseObject(result);
        List<AttendPlayers> players = parse.getJSONObject("messages").getJSONObject("data").getJSONArray("attendPlayers").toJavaList(AttendPlayers.class);
        return players;
    }
}
