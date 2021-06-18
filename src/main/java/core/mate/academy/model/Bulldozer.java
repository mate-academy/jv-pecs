package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private boolean hasRipper;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bladeType, boolean hasRipper) {
        setName(name);
        setColor(color);
        this.bladeType = bladeType;
        this.hasRipper = hasRipper;
    }

    public String getBladeType() {
        return bladeType;
    }

    public boolean hasRipper() {
        return hasRipper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
