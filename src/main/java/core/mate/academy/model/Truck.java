package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int age;

    public Truck() {

    }

    public Truck(int age, String color, String name) {
        super(color, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
