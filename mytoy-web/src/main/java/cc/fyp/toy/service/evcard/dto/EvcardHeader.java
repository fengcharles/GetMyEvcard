package cc.fyp.toy.service.evcard.dto;

/**
 * 请求头部信息
 */
public class EvcardHeader {

    private String sign;

    private String token;

    private String random;

    private String appkey;

    private String TimeStamp;

    @Override
    public String toString() {
        return "EvcardHeader{" +
                "sign='" + sign + '\'' +
                ", token='" + token + '\'' +
                ", random='" + random + '\'' +
                ", appkey='" + appkey + '\'' +
                ", TimeStamp='" + TimeStamp + '\'' +
                '}';
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        TimeStamp = timeStamp;
    }
}
