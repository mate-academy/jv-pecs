package core.mate.academy.model;

public class Truck extends Machine {
    private String country;
    private int wheelAmount;

    public Truck() {
    }

    public Truck(String country, int wheelAmount) {
        this.country = country;
        this.wheelAmount = wheelAmount;
    }

    public String getCountry() {
        return country;
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
