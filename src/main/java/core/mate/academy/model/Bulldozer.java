package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int horsePower;
    private int weight;

    public Bulldozer() {
    }

    public Bulldozer(int horsePower, int weight) {
        this.horsePower = horsePower;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
