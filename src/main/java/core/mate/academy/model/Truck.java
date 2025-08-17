package core.mate.academy.model;

public class Truck extends Machine {
    private int bodyVolume;

    public Truck() {
    }

    public Truck(String name, String color, int bodyVolume) {
        super(name, color);
        this.bodyVolume = bodyVolume;
    }

    public int getBodyVolume() {
        return bodyVolume;
    }

    public void setBodyVolume(int bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
