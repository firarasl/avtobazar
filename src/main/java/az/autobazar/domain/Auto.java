package az.autobazar.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Auto extends AutoBazarBase  implements Serializable {

    private static final long serialVersionUID = -7925735899587775938L;

    private AutoType autoType;
    private User user;
    private AutoShop autoShop;
    private Model model;
    private BigDecimal price;
    private Currency currency;
    private Climatisation climatisation;
    private LightType lightType;
    private ParkingSensor parkingSensor;
    private InteriorMaterial interiorMaterial;
    private LocalDateTime createDateTime;
    private FuelType fuelType;
    private GearType gearType;
    private EuroClass euroClass;
    private Country country;
    private City city;
    private Color interiorColor;
    private Color exteriorColor;
    private Media media;
    private String vinCode;
    private String description;
    private double engine;
    private long mainMediaId;
    private long mileage;
    private int horsePower;
    private int year;
    private int seat;
    private int door;
    private boolean sideMirrorAdjustment;
    private boolean electricWindow;
    private boolean centralLocking;
    private boolean autoPilot;
    private boolean trailer;
    private boolean airbag;
    private boolean damaged;
    private boolean problem;
    private boolean firstOwner;
    private boolean seatAdjustment;
    private boolean bluetooth;
    private boolean seatVentilation;
    private boolean startStop;
    private boolean abs;
    private boolean esp;
    private boolean alarm;
    private boolean sunroof;
    private boolean used;

    public Auto() {

    }



    @Override
    public String toString() {
        return "Auto{" +
                "autoType=" + autoType +
                ", user=" + user +
                ", autoShop=" + autoShop +
                ", model=" + model +
                ", price=" + price +
                ", currency=" + currency +
                ", climatisation=" + climatisation +
                ", lightType=" + lightType +
                ", parkingSensor=" + parkingSensor +
                ", interiorMaterial=" + interiorMaterial +
                ", createDateTime=" + createDateTime +
                ", fuelType=" + fuelType +
                ", gearType=" + gearType +
                ", euroClass=" + euroClass +
                ", country=" + country +
                ", city=" + city +
                ", interiorColor=" + interiorColor +
                ", exteriorColor=" + exteriorColor +
                ", media=" + media +
                ", vinCode='" + vinCode + '\'' +
                ", description='" + description + '\'' +
                ", engine=" + engine +
                ", mainMediaId=" + mainMediaId +
                ", mileage=" + mileage +
                ", horsePower=" + horsePower +
                ", year=" + year +
                ", seat=" + seat +
                ", door=" + door +
                ", sideMirrorAdjustment=" + sideMirrorAdjustment +
                ", electricWindow=" + electricWindow +
                ", centralLocking=" + centralLocking +
                ", autoPilot=" + autoPilot +
                ", trailer=" + trailer +
                ", airbag=" + airbag +
                ", damaged=" + damaged +
                ", problem=" + problem +
                ", firstOwner=" + firstOwner +
                ", seatAdjustment=" + seatAdjustment +
                ", bluetooth=" + bluetooth +
                ", seatVentilation=" + seatVentilation +
                ", startStop=" + startStop +
                ", abs=" + abs +
                ", esp=" + esp +
                ", alarm=" + alarm +
                ", sunroof=" + sunroof +
                ", used=" + used +
                ", id=" + id +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                ", status=" + status +
                '}';
    }

    public AutoType getAutoType() {
        return autoType;
    }

    public void setAutoType(AutoType autoType) {
        this.autoType = autoType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AutoShop getAutoShop() {
        return autoShop;
    }

    public void setAutoShop(AutoShop autoShop) {
        this.autoShop = autoShop;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Climatisation getClimatisation() {
        return climatisation;
    }

    public void setClimatisation(Climatisation climatisation) {
        this.climatisation = climatisation;
    }

    public LightType getLightType() {
        return lightType;
    }

    public void setLightType(LightType lightType) {
        this.lightType = lightType;
    }

    public ParkingSensor getParkingSensor() {
        return parkingSensor;
    }

    public void setParkingSensor(ParkingSensor parkingSensor) {
        this.parkingSensor = parkingSensor;
    }

    public InteriorMaterial getInteriorMaterial() {
        return interiorMaterial;
    }

    public void setInteriorMaterial(InteriorMaterial interiorMaterial) {
        this.interiorMaterial = interiorMaterial;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public GearType getGearType() {
        return gearType;
    }

    public void setGearType(GearType gearType) {
        this.gearType = gearType;
    }

    public EuroClass getEuroClass() {
        return euroClass;
    }

    public void setEuroClass(EuroClass euroClass) {
        this.euroClass = euroClass;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Color getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(Color interiorColor) {
        this.interiorColor = interiorColor;
    }

    public Color getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(Color exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public long getMainMediaId() {
        return mainMediaId;
    }

    public void setMainMediaId(long mainMediaId) {
        this.mainMediaId = mainMediaId;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public boolean isSideMirrorAdjustment() {
        return sideMirrorAdjustment;
    }

    public void setSideMirrorAdjustment(boolean sideMirrorAdjustment) {
        this.sideMirrorAdjustment = sideMirrorAdjustment;
    }

    public boolean isElectricWindow() {
        return electricWindow;
    }

    public void setElectricWindow(boolean electricWindow) {
        this.electricWindow = electricWindow;
    }

    public boolean isCentralLocking() {
        return centralLocking;
    }

    public void setCentralLocking(boolean centralLocking) {
        this.centralLocking = centralLocking;
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public boolean isProblem() {
        return problem;
    }

    public void setProblem(boolean problem) {
        this.problem = problem;
    }

    public boolean isFirstOwner() {
        return firstOwner;
    }

    public void setFirstOwner(boolean firstOwner) {
        this.firstOwner = firstOwner;
    }

    public boolean isSeatAdjustment() {
        return seatAdjustment;
    }

    public void setSeatAdjustment(boolean seatAdjustment) {
        this.seatAdjustment = seatAdjustment;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isSeatVentilation() {
        return seatVentilation;
    }

    public void setSeatVentilation(boolean seatVentilation) {
        this.seatVentilation = seatVentilation;
    }

    public boolean isStartStop() {
        return startStop;
    }

    public void setStartStop(boolean startStop) {
        this.startStop = startStop;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isEsp() {
        return esp;
    }

    public void setEsp(boolean esp) {
        this.esp = esp;
    }

    public boolean isAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
