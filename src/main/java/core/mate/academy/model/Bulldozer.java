package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    int service;
    String motor;
    public Bulldozer(int service, String motor) {
        this.service = service;
        this.motor = motor;
    }

    public int getService() {
        return service;
    }

    public String getMotor() {
        return motor;
    }
    public Bulldozer() {

    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
