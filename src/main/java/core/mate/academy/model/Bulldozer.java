package core.mate.academy.model;

public class Bulldozer extends Machine {

    private int weight;
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
