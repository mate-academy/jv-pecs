package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String manufacturer;
    private int horsePower;

    public Bulldozer() {
    }

    public Bulldozer(String manufacturer, int horsePower) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
