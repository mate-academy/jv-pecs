package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String type;
    private double dozerCapacity;
    private int numberOFTeeth;
    public Bulldozer() {
    }
    public Bulldozer (String name, String color, String type,
                      double dozerCapacity, int numberOFTeeth) {
        super(name, color);
        this.type = type;
        this.dozerCapacity = dozerCapacity;
        this.numberOFTeeth = numberOFTeeth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDozerCapacity() {
        return dozerCapacity;
    }

    public void setDozerCapacity(double dozerCapacity) {
        this.dozerCapacity = dozerCapacity;
    }

    public int getNumberOFTeeth() {
        return numberOFTeeth;
    }

    public void setNumberOFTeeth(int numberOFTeeth) {
        this.numberOFTeeth = numberOFTeeth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
