package core.mate.academy.model;

public class Bulldozer extends Machine {
    int bucketCapacity;
    int workTime;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bucketCapacity, int workTime) {
        super(name, color);
        this.bucketCapacity = bucketCapacity;
        this.workTime = workTime;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
