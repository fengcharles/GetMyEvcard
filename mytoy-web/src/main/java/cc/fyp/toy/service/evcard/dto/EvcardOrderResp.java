package cc.fyp.toy.service.evcard.dto;

/**
 * 预约返回值
 */
public class EvcardOrderResp extends EvcardComm {

    private String orderSeq;

    @Override
    public String toString() {
        return "EvcardOrderResp{" +
                "orderSeq='" + orderSeq + '\'' +
                '}';
    }

    public String getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(String orderSeq) {
        this.orderSeq = orderSeq;
    }

}
