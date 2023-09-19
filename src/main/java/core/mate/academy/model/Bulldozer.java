package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int widthBlade;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int widthBlade) {
        super(name, color);
        this.widthBlade = widthBlade;
    }

    public int getWidthBlade() {
        return widthBlade;
    }

    public void setWidthBlade(int widthBlade) {
        this.widthBlade = widthBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
