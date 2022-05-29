package core.mate.academy.model;

public class Truck extends Machine {
    private String type;
    private int number;

    public Truck() {
    }

    public Truck(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
