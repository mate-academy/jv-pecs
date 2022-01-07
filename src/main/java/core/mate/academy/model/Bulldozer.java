package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerName;
    private Integer power;
    private Double wheelRadius;
    private Double fuelConsumption;

    public Bulldozer(String bulldozerName, Integer power,
                     Double wheelRadius, Double fuelConsumption) {
        this.bulldozerName = bulldozerName;
        this.power = power;
        this.wheelRadius = wheelRadius;
        this.fuelConsumption = fuelConsumption;
    }

    public Bulldozer() {
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Double getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(Double wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getBulldozerName() {
        return bulldozerName;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
