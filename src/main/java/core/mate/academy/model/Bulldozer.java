package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private String bladeWidth;
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bladeWidth, String model) {
        super(name, color);
        this.bladeWidth = bladeWidth;
        this.model = model;
    }

    public String getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(String bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
