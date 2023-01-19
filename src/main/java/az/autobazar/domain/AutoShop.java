package az.autobazar.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class AutoShop extends AutoBazarBase implements Serializable {

    private String name;
    private boolean isOfficial;
    private int viewCount;
    private String shopDescription;
    private String workingSchedule;
    private String address;
    private BigDecimal addressLongitude;
    private BigDecimal getAddressLatitude;
    private String backgroundImage;
    private long logoId;
    private String slogan;

    public AutoShop() {
    }

    public AutoShop(String name) {
        this.name = name;
    }

    public AutoShop(String name, boolean isOfficial, int viewCount, String shopDescription, String workingSchedule, String address, BigDecimal addressLongitude, BigDecimal getAddressLatitude, String backgroundImage, long logoId, String slogan) {
        this.name = name;
        this.isOfficial = isOfficial;
        this.viewCount = viewCount;
        this.shopDescription = shopDescription;
        this.workingSchedule = workingSchedule;
        this.address = address;
        this.addressLongitude = addressLongitude;
        this.getAddressLatitude = getAddressLatitude;
        this.backgroundImage = backgroundImage;
        this.logoId = logoId;
        this.slogan = slogan;
    }

    public AutoShop(String name, String shopDescription, String workingSchedule, String address) {
        this.name = name;
        this.shopDescription = shopDescription;
        this.workingSchedule = workingSchedule;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public void setOfficial(boolean official) {
        isOfficial = official;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public String getWorkingSchedule() {
        return workingSchedule;
    }

    public void setWorkingSchedule(String workingSchedule) {
        this.workingSchedule = workingSchedule;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getAddressLongitude() {
        return addressLongitude;
    }

    public void setAddressLongitude(BigDecimal addressLongitude) {
        this.addressLongitude = addressLongitude;
    }

    public BigDecimal getGetAddressLatitude() {
        return getAddressLatitude;
    }

    public void setGetAddressLatitude(BigDecimal getAddressLatitude) {
        this.getAddressLatitude = getAddressLatitude;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public long getLogoId() {
        return logoId;
    }

    public void setLogoId(long logoId) {
        this.logoId = logoId;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoShop autoShop = (AutoShop) o;
        return isOfficial == autoShop.isOfficial &&
                viewCount == autoShop.viewCount &&
                logoId == autoShop.logoId &&
                Objects.equals(name, autoShop.name) &&
                Objects.equals(shopDescription, autoShop.shopDescription) &&
                Objects.equals(workingSchedule, autoShop.workingSchedule) &&
                Objects.equals(address, autoShop.address) &&
                Objects.equals(addressLongitude, autoShop.addressLongitude) &&
                Objects.equals(getAddressLatitude, autoShop.getAddressLatitude) &&
                Objects.equals(backgroundImage, autoShop.backgroundImage) &&
                Objects.equals(slogan, autoShop.slogan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isOfficial, viewCount, shopDescription, workingSchedule, address, addressLongitude, getAddressLatitude, backgroundImage, logoId, slogan);
    }

    @Override
    public String toString() {
        return "AutoShop{" +
                "name='" + name + '\'' +
                ", isOfficial=" + isOfficial +
                ", viewCount=" + viewCount +
                ", shopDescription='" + shopDescription + '\'' +
                ", workingSchedule='" + workingSchedule + '\'' +
                ", address='" + address + '\'' +
                ", addressLongitude=" + addressLongitude +
                ", getAddressLatitude=" + getAddressLatitude +
                ", backgroundImage='" + backgroundImage + '\'' +
                ", logoId=" + logoId +
                ", slogan='" + slogan + '\'' +
                ", id=" + id +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                ", status=" + status +
                '}';
    }
}
