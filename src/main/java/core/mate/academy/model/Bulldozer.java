package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean hasCaterpillars;
    private int weight;

    public Bulldozer() {
    }

    public boolean hasCaterpillars() {
        return hasCaterpillars;
    }

    public void setHasCaterpillars(boolean hasCaterpillars) {
        this.hasCaterpillars = hasCaterpillars;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
