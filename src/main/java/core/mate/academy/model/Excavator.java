package core.mate.academy.model;

public class Excavator extends Machine {
    private String manufacturer;
    private Integer grabCapacity;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getGrabCapacity() {
        return grabCapacity;
    }

    public void setGrabCapacity(Integer grabCapacity) {
        this.grabCapacity = grabCapacity;
    }
}
