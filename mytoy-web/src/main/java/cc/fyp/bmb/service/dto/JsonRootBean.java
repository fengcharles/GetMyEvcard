/**
  * Copyright 2020 bejson.com 
  */
package cc.fyp.bmb.service.dto;

/**
 * Auto-generated: 2020-01-08 15:13:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private boolean error;
    private boolean verify;
    private boolean redirect;
    private boolean ok;
    private int timecost;
    private int code;
    private Messages messages;
    public void setError(boolean error) {
         this.error = error;
     }
     public boolean getError() {
         return error;
     }

    public void setVerify(boolean verify) {
         this.verify = verify;
     }
     public boolean getVerify() {
         return verify;
     }

    public void setRedirect(boolean redirect) {
         this.redirect = redirect;
     }
     public boolean getRedirect() {
         return redirect;
     }

    public void setOk(boolean ok) {
         this.ok = ok;
     }
     public boolean getOk() {
         return ok;
     }

    public void setTimecost(int timecost) {
         this.timecost = timecost;
     }
     public int getTimecost() {
         return timecost;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setMessages(Messages messages) {
         this.messages = messages;
     }
     public Messages getMessages() {
         return messages;
     }

}