package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWidth;
    private int bladeHeight;
    private int maximumBladeAngle;
    private int minimumBladeAngle;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeWidth,
                     int bladeHeight, int maximumBladeAngle, int minimumBladeAngle) {
        setName(name);
        setColor(color);
        this.bladeWidth = bladeWidth;
        this.bladeHeight = bladeHeight;
        this.maximumBladeAngle = maximumBladeAngle;
        this.minimumBladeAngle = minimumBladeAngle;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getBladeHeight() {
        return bladeHeight;
    }

    public void setBladeHeight(int bladeHeight) {
        this.bladeHeight = bladeHeight;
    }

    public float getMaximumBladeAngle() {
        return maximumBladeAngle;
    }

    public void setMaximumBladeAngle(int maximumBladeAngle) {
        this.maximumBladeAngle = maximumBladeAngle;
    }

    public float getMinimumBladeAngle() {
        return minimumBladeAngle;
    }

    public void setMinimumBladeAngle(int minimumBladeAngle) {
        this.minimumBladeAngle = minimumBladeAngle;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
