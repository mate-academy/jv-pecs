package core.mate.academy.model;

public class Truck extends Machine {
    private double cargoWeight;
    private int wheelNum;

    public Truck() {
        super(null, null);
    }

    public Truck(String name, String color, double cargoWeight, int wheelNum) {
        super(name, color);
        this.cargoWeight = cargoWeight;
        this.wheelNum = wheelNum;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{"
                + super.toString()
                + "cargoWeight=" + cargoWeight
                + ", wheelNum=" + wheelNum
                + "}\n";
    }
}
