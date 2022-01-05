package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String powerUnit;
    private String undercarriageType;

    public Excavator() {
    }

    public String getPowerUnit() {
        return powerUnit;
    }

    public void setPowerUnit(String powerUnit) {
        this.powerUnit = powerUnit;
    }

    public String getUndercarriageType() {
        return undercarriageType;
    }

    public void setUndercarriageType(String undercarriageType) {
        this.undercarriageType = undercarriageType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public void bucketVolume(double v) {

    }

    @Override
    public void setLoadCapacity(int i) {

    }
}
