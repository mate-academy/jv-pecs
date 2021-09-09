package core.mate.academy.model;

public abstract class Machine implements Workable {
    protected String name;
    protected String color;

    protected Machine() {
        name = "default name";
        color = "default color";
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
