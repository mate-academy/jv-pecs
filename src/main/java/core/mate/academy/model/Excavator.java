package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String maker;
    private int age;

    public Excavator() {
    }

    public Excavator(String maker, int age) {
        this.maker = maker;
        this.age = age;
    }

    String getMaker() {
        return maker;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
