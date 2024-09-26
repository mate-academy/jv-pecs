package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String model;
    private String name;
    private String color;

    public Machine() {

    }

    public Machine(String model, String name, String color) {
        this.model = model;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
