package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bladeType;
    private String ripperType;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public void setRipperType(String ripperType) {
        this.ripperType = ripperType;
    }

    public String getBladeType() {
        return bladeType;
    }

    public String getRipperType() {
        return ripperType;
    }
}
