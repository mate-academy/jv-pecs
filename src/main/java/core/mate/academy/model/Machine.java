package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;

    Machine(String name, String color) {
        this.color = color;
        this.name = name;
    }

    Machine() {

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
