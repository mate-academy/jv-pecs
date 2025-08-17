package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private String modelBulldozer;
    private String bladeType;
    private Boolean isRemoteControlled;

    public Bulldozer(String modelBulldozer, String bladeType, Boolean isRemoteControlled) {
        this.modelBulldozer = modelBulldozer;
        this.bladeType = bladeType;
        this.isRemoteControlled = isRemoteControlled;
    }

    public Bulldozer() {

    }

    public void setModelBulldozer(String modelBulldozer) {
        this.modelBulldozer = modelBulldozer;
    }

    public String getModelBulldozer() {
        return modelBulldozer;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setRemoteControlled(Boolean remoteControlled) {
        isRemoteControlled = remoteControlled;
    }

    public Boolean getRemoteControlled() {
        return isRemoteControlled;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
