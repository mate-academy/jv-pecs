package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketVolume;
    private int diggingDepth;

    public Excavator() {
        super(null, null);
    }

    public Excavator(String name, String color, double bucketVolume, int diggingDepth) {
        super(name, color);
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
