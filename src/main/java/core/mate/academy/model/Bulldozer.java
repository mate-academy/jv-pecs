package core.mate.academy.model;

public class Bulldozer extends Machine {

    private String brand;
    private int cost;

    public Bulldozer(String brand, int cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public Bulldozer() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
