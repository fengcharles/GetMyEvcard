/**
  * Copyright 2020 bejson.com 
  */
package cc.fyp.bmb.service.dto;
import java.util.Date;

/**
 * Auto-generated: 2020-01-08 15:13:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Messages {

    private Date serverTime;
    private Data data;
    public void setServerTime(Date serverTime) {
         this.serverTime = serverTime;
     }
     public Date getServerTime() {
         return serverTime;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

}