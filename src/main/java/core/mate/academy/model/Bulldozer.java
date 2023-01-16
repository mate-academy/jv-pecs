package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private Integer pushPower;
    private String bladeType;

    public Bulldozer() {
    }

    public Bulldozer(Integer pushPower, String bladeType) {
        this.pushPower = pushPower;
        this.bladeType = bladeType;
    }

    public Integer getPushPower() {
        return pushPower;
    }

    public void setPushPower(Integer pushPower) {
        this.pushPower = pushPower;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
