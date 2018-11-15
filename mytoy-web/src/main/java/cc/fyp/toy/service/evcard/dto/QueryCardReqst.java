package cc.fyp.toy.service.evcard.dto;

/**
 * @author von
 */
public class QueryCardReqst {

    private String canRent;

    private Long  shopSeq;

    @Override
    public String toString() {
        return "QueryCardReqst{" +
                "canRent='" + canRent + '\'' +
                ", shopSeq=" + shopSeq +
                '}';
    }

    public String getCanRent() {
        return canRent;
    }

    public void setCanRent(String canRent) {
        this.canRent = canRent;
    }

    public Long getShopSeq() {
        return shopSeq;
    }

    public void setShopSeq(Long shopSeq) {
        this.shopSeq = shopSeq;
    }
}
