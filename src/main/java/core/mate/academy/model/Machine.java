package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;
    private String model;
    private int year;

    public Machine(String name, String color, String model, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.model = model;
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

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
}
