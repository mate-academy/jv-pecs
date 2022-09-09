package core.mate.academy.model;

public class Truck extends Machine {
    private int wheelsNumber;
    private boolean tent;

    public Truck() {
    }

    public Truck(String name, String color, int wheelsNumber, boolean tent) {
        setName(name);
        setColor(color);
        this.wheelsNumber = wheelsNumber;
        this.tent = tent;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public boolean isTent() {
        return tent;
    }

    public void setTent(boolean tent) {
        this.tent = tent;
    }
}
