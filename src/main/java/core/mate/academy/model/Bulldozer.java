package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {

    private int shieldWidth;
    private int shieldHeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int shieldWidth, int shieldHeight) {
        setName(name);
        setColor(color);
        this.shieldWidth = shieldWidth;
        this.shieldHeight = shieldHeight;
    }

    public int getShieldWidth() {
        return shieldWidth;
    }

    public void setShieldWidth(int shieldWidth) {
        this.shieldWidth = shieldWidth;
    }

    public int getShieldHeight() {
        return shieldHeight;
    }

    public void setShieldHeight(int shieldHeight) {
        this.shieldHeight = shieldHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
