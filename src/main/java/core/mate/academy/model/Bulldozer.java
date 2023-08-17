package core.mate.academy.model;

public class Bulldozer extends Machine {
    public Bulldozer() {
        super("", "", 0);
    }

    public Bulldozer(String name, String color, int horsePower) {
        super(name, color, horsePower);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
