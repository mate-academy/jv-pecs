package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int service;
    private String motor;

    public Bulldozer(int service, String motor) {
        this.service = service;
        this.motor = motor;
    }

    public Bulldozer() {
    }

    public int getService() {
        return service;
    }

    public String getMotor() {
        return motor;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
