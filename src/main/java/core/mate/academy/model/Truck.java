package core.mate.academy.model;

public class Truck extends Machine {
    private String typeOfTrailer;
    private double loadCapacity;
    private String brakingSystem;

    public Truck() {
    }

    public Truck(String typeOfTrailer, double loadCapacity, String brakingSystem) {
        this.typeOfTrailer = typeOfTrailer;
        this.loadCapacity = loadCapacity;
        this.brakingSystem = brakingSystem;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public String getTypeOfTrailer() {
        return typeOfTrailer;
    }

    public void setTypeOfTrailer(String typeOfTrailer) {
        this.typeOfTrailer = typeOfTrailer;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getBrakingSystem() {
        return brakingSystem;
    }

    public void setBrakingSystem(String brakingSystem) {
        this.brakingSystem = brakingSystem;
    }
}
