package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bladeType;

    public Bulldozer() {
    }

    public Bulldozer(String bladeType, String name, String color) {
        this.bladeType = bladeType;
        super.setName(name);
        super.setName(color);
    }

    public String getBladeType() {
        return bladeType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
