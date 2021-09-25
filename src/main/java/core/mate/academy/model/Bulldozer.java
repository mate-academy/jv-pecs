package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int dumpWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int dumpWeight) {
        super.setName(name);
        super.setColor(color);
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
