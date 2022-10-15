package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladesColor;
    private int bladesPower;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bladesColor, int bladesPower) {
        super(name, color);
        this.bladesColor = bladesColor;
        this.bladesPower = bladesPower;
    }

    public String getBladesColor() {
        return bladesColor;
    }

    public void setBladesColor(String bladesColor) {
        this.bladesColor = bladesColor;
    }

    public int getBladesPower() {
        return bladesPower;
    }

    public void setBladesPower(int bladesPower) {
        this.bladesPower = bladesPower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
