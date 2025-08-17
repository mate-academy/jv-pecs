package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean withOtval;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, boolean withOtval) {
        super(name, color);
        this.withOtval = withOtval;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
