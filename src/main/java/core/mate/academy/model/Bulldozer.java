package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String typeChassis;
    private int dumpWeight;

    public Bulldozer() {
    }

    public String getTypeChassis() {
        return typeChassis;
    }

    public void setTypeChassis(String typeChassis) {
        this.typeChassis = typeChassis;
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
