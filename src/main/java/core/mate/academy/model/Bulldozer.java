package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int enginePower;
    private int bladeWidth;
    private String bulldozerType;

    public Bulldozer() {

    }

    public Bulldozer(int enginePower, int bladeWidth, String bulldozerType) {
        setEnginePower(enginePower);
        setBladeWidth(bladeWidth);
        setBulldozerType(bulldozerType);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public void setBulldozerType(String bulldozerType) {
        this.bulldozerType = bulldozerType;
    }
}
