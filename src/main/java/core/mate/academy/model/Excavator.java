package core.mate.academy.model;

public class Excavator extends Machine {
    private String type;
    private boolean isBucket;

    public Excavator() {
    }

    public Excavator(String name, String color, String type, boolean isBucket) {
        super(name, color);
        this.type = type;
        this.isBucket = isBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
