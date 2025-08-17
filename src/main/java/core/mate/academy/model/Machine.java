package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;

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
