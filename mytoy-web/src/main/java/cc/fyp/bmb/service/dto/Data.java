/**
  * Copyright 2020 bejson.com 
  */
package cc.fyp.bmb.service.dto;
import java.util.List;

/**
 * Auto-generated: 2020-01-08 15:13:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private List<Games> games;
    private int upCount;
    private int downCount;
    private int pageSize;
    private int pageNum;
    public void setGames(List<Games> games) {
         this.games = games;
     }
     public List<Games> getGames() {
         return games;
     }

    public void setUpCount(int upCount) {
         this.upCount = upCount;
     }
     public int getUpCount() {
         return upCount;
     }

    public void setDownCount(int downCount) {
         this.downCount = downCount;
     }
     public int getDownCount() {
         return downCount;
     }

    public void setPageSize(int pageSize) {
         this.pageSize = pageSize;
     }
     public int getPageSize() {
         return pageSize;
     }

    public void setPageNum(int pageNum) {
         this.pageNum = pageNum;
     }
     public int getPageNum() {
         return pageNum;
     }

}