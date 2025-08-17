package core.mate.academy.model;

public class Excavator extends Machine {
    private int length;
    private int height;
    private String type;

    public Excavator() {
    }

    public Excavator(String name, String color, int length,
                     int height, String type) {
        super(name, color);
        this.length = length;
        this.height = height;
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
