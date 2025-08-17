package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String type;
    private double dozerCapacity;
    private int numberOfTeeth;

    public Bulldozer() {
    }

    private Bulldozer(String name, String color, String type,
                      double dozerCapacity, int numberOfTeeth) {
        super(name, color);
        this.type = type;
        this.dozerCapacity = dozerCapacity;
        this.numberOfTeeth = numberOfTeeth;
    }

    public static Bulldozer create(String name, String color, String type,
                               double dozerCapacity, int numberOfTeeth) {
        return new Bulldozer(name, color, type, dozerCapacity, numberOfTeeth);
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

    public int getNumberOfTeeth() {
        return numberOfTeeth;
    }

    public void setNumberOfTeeth(int numberOfTeeth) {
        this.numberOfTeeth = numberOfTeeth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
