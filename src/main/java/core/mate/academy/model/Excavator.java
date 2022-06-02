package core.mate.academy.model;

public class Excavator extends Machine {
    private int size;
    private int gasConsumptionPerHour;
    private String brand;

    public Excavator() {
    }

    public Excavator(String name, String color, int size, int gasConsumptionPerHour, String brand) {
        setName(name);
        setColor(color);
        this.size = size;
        this.gasConsumptionPerHour = gasConsumptionPerHour;
        this.brand = brand;
    }

    public void setGasConsumptionPerHour(int gasConsumptionPerHour) {
        this.gasConsumptionPerHour = gasConsumptionPerHour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getGasConsumptionPerHour() {
        return gasConsumptionPerHour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
