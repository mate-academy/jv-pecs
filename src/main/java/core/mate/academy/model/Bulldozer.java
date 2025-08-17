package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int speed;
    private String type;

    public Bulldozer(int speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    public Bulldozer() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getTypeOfEngine() {
        return type;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.type = typeOfEngine;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
