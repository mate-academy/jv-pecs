package core.mate.academy.model;

/**
 * Add some custom fields that could be only in BulldozerProducer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("BulldozerProducer started to work");
    }
}
