package cc.fyp.toy.service.evcard.dto;

public class Evcards {

    private String shopSeq;
    private String shopName;
    private String areaCode;
    private String vin;
    private String vehicleNo;
    private String vehicleModelSeq;
    private String vehicleModelName;
    private String soc;
    private String oil;
    private String serviceStatus;
    private String canRent;
    private String drivingRange;
    private String priceDesc;
    private String nightCarPrice;

    @Override
    public String toString() {
        return "Evcards{" +
                "shopSeq='" + shopSeq + '\'' +
                ", shopName='" + shopName + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", vin='" + vin + '\'' +
                ", vehicleNo='" + vehicleNo + '\'' +
                ", vehicleModelSeq='" + vehicleModelSeq + '\'' +
                ", vehicleModelName='" + vehicleModelName + '\'' +
                ", soc='" + soc + '\'' +
                ", oil='" + oil + '\'' +
                ", serviceStatus='" + serviceStatus + '\'' +
                ", canRent='" + canRent + '\'' +
                ", drivingRange='" + drivingRange + '\'' +
                ", priceDesc='" + priceDesc + '\'' +
                ", nightCarPrice='" + nightCarPrice + '\'' +
                '}';
    }

    public String getShopSeq() {
        return shopSeq;
    }

    public void setShopSeq(String shopSeq) {
        this.shopSeq = shopSeq;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleModelSeq() {
        return vehicleModelSeq;
    }

    public void setVehicleModelSeq(String vehicleModelSeq) {
        this.vehicleModelSeq = vehicleModelSeq;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getCanRent() {
        return canRent;
    }

    public void setCanRent(String canRent) {
        this.canRent = canRent;
    }

    public String getDrivingRange() {
        return drivingRange;
    }

    public void setDrivingRange(String drivingRange) {
        this.drivingRange = drivingRange;
    }

    public String getPriceDesc() {
        return priceDesc;
    }

    public void setPriceDesc(String priceDesc) {
        this.priceDesc = priceDesc;
    }

    public String getNightCarPrice() {
        return nightCarPrice;
    }

    public void setNightCarPrice(String nightCarPrice) {
        this.nightCarPrice = nightCarPrice;
    }
}
