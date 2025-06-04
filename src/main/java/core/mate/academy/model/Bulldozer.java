package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;

    public Bulldozer(String bladeType) {
        this.bladeType = bladeType;
    }

    public Bulldozer() {
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
