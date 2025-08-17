package core.mate.academy.model;

public class Truck extends Machine {
    private int numberOfWheels;
    private String mark;

    public Truck(int numberOfWheels, String mark) {
        this.numberOfWheels = numberOfWheels;
        this.mark = mark;
    }

    public Truck() {
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
