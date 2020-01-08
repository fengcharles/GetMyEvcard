/**
  * Copyright 2020 bejson.com 
  */
package cc.fyp.bmb.service.dto;

import lombok.Data;

/**
 * Auto-generated: 2020-01-08 15:16:19
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class PaticipatePlayers {

    private String id;
    private String nickName;
    private int relationTeam;
    private String avatar;
    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setNickName(String nickName) {
         this.nickName = nickName;
     }
     public String getNickName() {
         return nickName;
     }

    public void setRelationTeam(int relationTeam) {
         this.relationTeam = relationTeam;
     }
     public int getRelationTeam() {
         return relationTeam;
     }

    public void setAvatar(String avatar) {
         this.avatar = avatar;
     }
     public String getAvatar() {
         return avatar;
     }

}