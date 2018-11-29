package cc.fyp.toy.service.evcard.dto;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class QueryDTO {

    private List<Integer> areas;
    private List<String> types;
    private Integer oil;
    private Date startDate;
    private Long querySeq;
    private String seqName;
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

    @Override
    public String toString() {
        return "QueryDTO{" +
                "areas=" + areas +
                ", types=" + types +
                ", oil=" + oil +
                ", startDate=" + startDate +
                ", querySeq=" + querySeq +
                ", seqName='" + seqName + '\'' +
                ", queryTime=" + queryTime +
                '}';
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getQuerySeq() {
        return querySeq;
    }

    public void setQuerySeq(Long querySeq) {
        this.querySeq = querySeq;
    }

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName;
    }

    public Integer getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Integer queryTime) {
        this.queryTime = queryTime;
    }
}
