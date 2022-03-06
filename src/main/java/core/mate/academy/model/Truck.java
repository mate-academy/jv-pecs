package core.mate.academy.model;

public class Truck extends Machine {
    private String weight;

    public Truck() {
    }

    public Truck(String name, String color, String weight) {
        super(name, color);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
