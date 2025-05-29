package core.mate.academy.model;

public abstract class Machine implements Workable, Cloneable {
    private String name;
    private String color;

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

    @Override
    public Machine clone() throws CloneNotSupportedException {
        return (Machine) super.clone();
    }
}
