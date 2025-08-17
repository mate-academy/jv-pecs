package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bulldozerChassisType;
    private String bladeType;
    private String bulldozerType;

    public Bulldozer() {
    }

    public String getBulldozerChassisType() {
        return bulldozerChassisType;
    }

    public String getBladeType() {
        return bladeType;
    }

    public String getBulldozerType() {
        return bulldozerType;
    }

    public void setBulldozerChassisType(String bulldozerChassisType) {
        this.bulldozerChassisType = bulldozerChassisType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public void setBulldozerType(String bulldozerType) {
        this.bulldozerType = bulldozerType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
