package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;
    private String manufacturer;

    public Machine() {
    }

    public Machine(String name, String color, String manufacturer) {
        this.name = name;
        this.color = color;
        this.manufacturer = manufacturer;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
