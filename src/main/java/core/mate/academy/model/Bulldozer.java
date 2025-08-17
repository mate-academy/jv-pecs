package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;

    public Bulldozer() {
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
