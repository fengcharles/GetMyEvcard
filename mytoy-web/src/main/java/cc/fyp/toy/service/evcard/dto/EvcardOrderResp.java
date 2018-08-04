package cc.fyp.toy.service.evcard.dto;

/**
 * 预约返回值
 */
public class EvcardOrderResp {

    private String orderSeq;
    private String message;
    private String status;

    @Override
    public String toString() {
        return "EvcardOrderResp{" +
                "orderSeq='" + orderSeq + '\'' +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(String orderSeq) {
        this.orderSeq = orderSeq;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
