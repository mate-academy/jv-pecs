package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketVolume;
    private int diggingDepth;

    public Excavator() {

    }

    public Excavator(String name, String color, double bucketVolume, int diggingDepth) {
        setName(name);
        setColor(color);
        this.bucketVolume = bucketVolume;
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return "Excavator{"
                + super.toString()
                + "bucketVolume=" + bucketVolume
                + ", diggingDepth=" + diggingDepth
                + "}\n";
    }
}
