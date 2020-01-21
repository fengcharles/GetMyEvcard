package cc.fyp.bmb.service.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


/**
 * @author von
 * @description:
 * @date 2020/1/8 15:09
 */
@Data
public class PaylserCountDTO {


    private String userName;

    private List<TeamGamesShowDTO> infos;

    private BigDecimal rate;

}
