package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int showelType;

    public Bulldozer() {

    }

    public Bulldozer(String name, String color, int power, int showelType) {
        super(name, color, power);
        this.showelType = showelType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
