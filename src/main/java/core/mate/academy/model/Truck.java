package core.mate.academy.model;

public class Truck extends Machine {
    private int weight;
    private String type;

    public Truck() {
    }

    public Truck(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
