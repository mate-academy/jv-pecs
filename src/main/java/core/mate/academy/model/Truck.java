package core.mate.academy.model;

public class Truck extends Machine {
    private String typeOfTruck;
    private int length;

    public Truck() {
    }

    public Truck(String name, String color,String typeOfTruck, int length) {
        super(name, color);
        this.typeOfTruck = typeOfTruck;
        this.length = length;
    }

    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
