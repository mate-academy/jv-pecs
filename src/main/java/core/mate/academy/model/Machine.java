package core.mate.academy.model;

public abstract class Machine implements Workable {
    public static final int MIN_POWER = 100;
    public static final int MAX_POWER = 600;
    private String name;
    private String color;
    private int power;

    public Machine() {
    }

    public Machine(String name, String color, int power) {
        this.name = name;
        this.color = color;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
