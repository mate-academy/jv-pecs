package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int enginePower;
    private String dumpType;

    public Bulldozer() {
    }

    public Bulldozer(int enginePower, String dumpType) {
        this.enginePower = enginePower;
        this.dumpType = dumpType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getDumpType() {
        return dumpType;
    }

    public void setDumpType(String dumpType) {
        this.dumpType = dumpType;
    }
}
