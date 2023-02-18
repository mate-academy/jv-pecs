package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int dumperCount;
    private int engineCapacity;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int dumperCount, int engineCapacity) {
        this.setName(name);
        this.setColor(color);
        this.dumperCount = dumperCount;
        this.engineCapacity = engineCapacity;
    }

    public int getDumperCount() {
        return dumperCount;
    }

    public void setDumperCount(int dumperCount) {
        this.dumperCount = dumperCount;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "Name= " + this.getName()
                + ", color= " + this.getColor()
                + ", dumperCount=" + dumperCount
                + ", engineCapacity=" + engineCapacity
                + '}';
    }
}
