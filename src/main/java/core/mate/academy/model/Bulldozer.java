package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int weight;
    private int height;
    private int dumpDeepening;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int weight, int height, int dumpDeepening) {
        super(name, color);
        this.weight = weight;
        this.height = height;
        this.dumpDeepening = dumpDeepening;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDumpDeepening() {
        return dumpDeepening;
    }

    public void setDumpDeepening(int dumpDeepening) {
        this.dumpDeepening = dumpDeepening;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
