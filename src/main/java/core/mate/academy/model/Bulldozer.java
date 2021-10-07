package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String manufacturerName;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String manufacturerName) {
        super(name, color);
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
