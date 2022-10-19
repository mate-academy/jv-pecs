package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String dumpType;

    public Bulldozer() {
    }

    public Bulldozer(String name,String color,String dumpType) {
        super();
        this.setName(name);
        this.setColor(color);
        this.dumpType = dumpType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getDumpType() {
        return dumpType;
    }

    public void setDumpType(String dumpType) {
        this.dumpType = dumpType;
    }
}
