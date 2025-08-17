package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int dumpWeight;

    public Bulldozer(String name, String color, int dumpWeight) {
        super(name, color);
        this.dumpWeight = dumpWeight;
    }

    public int getDumpWeight() {
        return dumpWeight;
    }

    public void setDumpWeight(int dumpWeight) {
        this.dumpWeight = dumpWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
