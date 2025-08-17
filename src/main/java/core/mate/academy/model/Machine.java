package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;
    private int power;

    public Machine(String name, String color, int power) {
        this.name = name;
        this.color = color;
        this.power = power;
    }

    protected Machine() {
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
}
