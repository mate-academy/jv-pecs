package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int classNumber;

    public Truck() {
        super();
    }

    public Truck(String name, String color, int classNumber) {
        super(name, color);
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
