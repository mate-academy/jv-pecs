package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String color;

    public Bulldozer() {
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
