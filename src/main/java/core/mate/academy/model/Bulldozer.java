package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeLength;
    private int ripperLength;
    private String type;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeLength,
                     int ripperLength, String type) {
        super(name, color);
        this.bladeLength = bladeLength;
        this.ripperLength = ripperLength;
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
