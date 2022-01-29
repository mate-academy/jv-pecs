package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int years;
    private int height;

    public Excavator() {
    }

    public Excavator(String name, String color) {
        super(name, color);
    }

    public Excavator(String name, String color, int years, int height) {
        super(name, color);
        this.years = years;
        this.height = height;
    }

    public int getYears() {
        return years;
    }

    public int getHeight() {
        return height;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
