package cc.fyp.toy.service.evcard.dto;

/**
 * 查询车辆结果返回值
 * @author von
 */
public class FindCarResultDTO {

    private Boolean flag;
    private String mesg;

    public FindCarResultDTO(Boolean flag,String mesg){
        this.flag = flag;
        this.mesg = mesg;
    }

    @Override
    public String toString() {
        return "FindCarResultDTO{" +
                "flag=" + flag +
                ", mesg='" + mesg + '\'' +
                '}';
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }
}
