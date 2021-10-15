package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int wight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int wight) {
        super(name, color);
        this.wight = wight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void setWight(int wight) {
        this.wight = wight;
    }
}
