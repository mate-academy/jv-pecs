package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int dozerBladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int dozerBladeWidth) {
        super.setName(name);
        super.setColor(color);
        this.dozerBladeWidth = dozerBladeWidth;
    }

    public void setDozerBladeWidth(int dozerBladeWidth) {
        this.dozerBladeWidth = dozerBladeWidth;
    }

    public int getDozerBladeWidth() {
        return dozerBladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
