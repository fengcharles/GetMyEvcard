package cc.fyp.toy.service.evcard.dto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class QueryDTO {

    private String option;
    private Integer carType;
    private Integer oil;
    private Date startDate;
    private String strStartDate;
    private Long querySeq;
    private Integer queryTime;


    public Boolean timeOut(){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.MINUTE,queryTime);

        if (new Date().compareTo(calendar.getTime()) <=0  ){
            return true;
        }else {
            return  false;
        }

    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getOil() {
        return oil;
    }

    public void setOil(Integer oil) {
        this.oil = oil;
    }

    public Long getQuerySeq() {
        return querySeq;
    }

    public void setQuerySeq(Long querySeq) {
        this.querySeq = querySeq;
    }

    public Integer getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Integer queryTime) {
        this.queryTime = queryTime;
    }

    public String getStrStartDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(this.startDate);
    }

    public void setStrStartDate(String strStartDate) {
        this.strStartDate = strStartDate;
    }

    @Override
    public String toString() {
        return "QueryDTO{" +
                "option='" + option + '\'' +
                ", carType=" + carType +
                ", oil=" + oil +
                ", startDate=" + startDate +
                ", querySeq=" + querySeq +
                ", queryTime=" + queryTime +
                '}';
    }
}
