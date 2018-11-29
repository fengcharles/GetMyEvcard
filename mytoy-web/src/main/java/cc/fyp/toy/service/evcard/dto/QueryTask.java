package cc.fyp.toy.service.evcard.dto;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class QueryTask {

    private List<Integer> areas;
    private List<String> types;
    private Integer oil;
    private Date startDate;
    private String strStartDate;
    private Long querySeq;
    private String seqName;
    private Integer queryTime;
    private Integer option;
    private String host;
    private Boolean flag;
    private Long taskId;


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

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public List<Integer> getAreas() {
        return areas;
    }

    public void setAreas(List<Integer> areas) {
        this.areas = areas;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
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

    public Integer getOption() {
        return option;
    }

    public void setOption(Integer option) {
        this.option = option;
    }

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    @Override
    public String toString() {
        return "QueryDTO{" +
                "areas=" + areas +
                ", types=" + types +
                ", oil=" + oil +
                ", startDate=" + startDate +
                ", strStartDate='" + strStartDate + '\'' +
                ", querySeq=" + querySeq +
                ", queryTime=" + queryTime +
                ", option=" + option +
                '}';
    }
}
