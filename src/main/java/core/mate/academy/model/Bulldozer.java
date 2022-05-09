package core.mate.academy.model;

import java.util.List;
/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String model) {
        super(name, color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Bulldozer setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<? extends Machine> get() {
        Bulldozer firstBulldozer = new Bulldozer("Cat", "Yellow", "C3.6");
        Bulldozer secondBulldozer = new Bulldozer("Cat", "Yellow", "C27");
        Bulldozer thirdBulldozer = new Bulldozer("Cat", "Yellow", "C32");

        return List.of(firstBulldozer, secondBulldozer, thirdBulldozer);
    }
}
