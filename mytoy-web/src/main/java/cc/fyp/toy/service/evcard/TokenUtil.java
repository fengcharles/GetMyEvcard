package cc.fyp.toy.service.evcard;

import cc.fyp.toy.service.evcard.outapi.EvcardApi;

/**
 * 获取登录token
 * @author von
 */
public class TokenUtil {


    private String token;

    private static TokenUtil tokenUtil;

    private TokenUtil(){}

    public static TokenUtil getInstance(){
        EvcardApi evcardApi =new EvcardApi();
        if (tokenUtil!=null){
            tokenUtil = new TokenUtil();
            tokenUtil.token = evcardApi.login();
        }else {
            if (tokenUtil.token == null){
                tokenUtil.token =evcardApi.login();
            }
        }
        return  tokenUtil;
    }

}
