package core.mate.academy.model;

public abstract class Machine<T> implements Workable {
    protected String name;
    protected String color;

    public Machine() {
    }

    public Machine(String name, String color) {
        this.name = name;
        this.color = color;
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
