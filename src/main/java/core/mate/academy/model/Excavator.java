package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String engin;
    private float bucketCapacity;

    public Excavator() {
    }

    public Excavator(String engin, float bucketCapacity,String name,String color) {
        this.engin = engin;
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
