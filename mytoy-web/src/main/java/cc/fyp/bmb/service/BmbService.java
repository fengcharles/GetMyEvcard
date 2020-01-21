package cc.fyp.bmb.service;

import cc.fyp.bmb.service.dto.AttendPlayers;
import cc.fyp.bmb.service.dto.Games;
import cc.fyp.bmb.service.dto.PaticipatePlayers;
import cc.fyp.bmb.service.dto.Players;

import java.util.List;

/**
 * @author von
 * @description:
 * @date 2020/1/8 15:07
 */
public interface BmbService {

     List<Players> loadAllPlayers();

     List<Games> loadGameInfo();

     List<AttendPlayers> loadByGameId(Long gameId);
}
