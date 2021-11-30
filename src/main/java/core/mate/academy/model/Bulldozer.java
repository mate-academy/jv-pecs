package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int lengthOfCaterpillars;
    private double sizeOfBlade;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int lengthOfCaterpillars, double sizeOfBlade) {
        super(name, color);
        this.lengthOfCaterpillars = lengthOfCaterpillars;
        this.sizeOfBlade = sizeOfBlade;
    }

    public int getLengthOfCaterpillars() {
        return lengthOfCaterpillars;
    }

    public void setLengthOfCaterpillars(int lengthOfCaterpillars) {
        this.lengthOfCaterpillars = lengthOfCaterpillars;
    }

    public double getSizeOfBlade() {
        return sizeOfBlade;
    }

    public void setSizeOfBlade(double sizeOfBlade) {
        this.sizeOfBlade = sizeOfBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
