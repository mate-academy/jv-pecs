package core.mate.academy.model;

public class Excavator extends Machine {
    private String manufacturer;
    private int horsePower;

    public Excavator() {
    }

    public Excavator(String manufacturer, int horsePower) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
