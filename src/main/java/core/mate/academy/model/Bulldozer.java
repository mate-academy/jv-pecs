package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int age;
    private String make;
    private int mass;

    public Bulldozer(int age, String make, int mass) {
        this.age = age;
        this.make = make;
        this.mass = mass;
    }

    public int getAge() {
        return age;
    }

    public String getMake() {
        return make;
    }

    public int getMass() {
        return mass;
    }

    public Bulldozer setAge(int age) {
        this.age = age;
        return this;
    }

    public Bulldozer setMake(String make) {
        this.make = make;
        return this;
    }

    public Bulldozer setMass(int mass) {
        this.mass = mass;
        return this;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
