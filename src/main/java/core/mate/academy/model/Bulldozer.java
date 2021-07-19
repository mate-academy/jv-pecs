package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements Workable {
    private int wheelQuantity;
    private double pushForce;

    public Bulldozer() {
    }

    public Bulldozer(int wheelQuantity, double pushForce) {
        this.wheelQuantity = wheelQuantity;
        this.pushForce = pushForce;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
