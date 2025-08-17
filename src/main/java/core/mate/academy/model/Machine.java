package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;
    private int horsePower;

    public Machine(String name, String color, int horsePower) {
        this.name = name;
        this.color = color;
        this.horsePower = horsePower;
    }

    protected Machine() {
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
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
