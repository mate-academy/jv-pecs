package core.mate.academy.model;

public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    public Bulldozer(String color, String name) {
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
