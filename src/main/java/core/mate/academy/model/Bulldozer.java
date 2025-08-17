package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String propellerType;
    private String bladeType;

    public Bulldozer() {
    }

    public String getPropellerType() {
        return propellerType;
    }

    public void setPropellerType(String propellerType) {
        this.propellerType = propellerType;
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
