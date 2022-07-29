package core.mate.academy.model;

public class Excavator extends Machine {
    private String size;
    private double diggingDepth;
    private boolean hasHydraulicHummer;

    public Excavator() {
    }

    private Excavator(String name, String color, String size,
                      double diggingDepth, boolean hasHydraulicHummer) {
        super(name, color);
        this.size = size;
        this.diggingDepth = diggingDepth;
        this.hasHydraulicHummer = hasHydraulicHummer;
    }

    public static Excavator create(String name, String color, String size,
                               double diggingDepth, boolean hasHydraulicHummer) {
        return new Excavator(name, color, size, diggingDepth, hasHydraulicHummer);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(double diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public boolean isHasHydraulicHummer() {
        return hasHydraulicHummer;
    }

    public void setHasHydraulicHummer(boolean hasHydraulicHummer) {
        this.hasHydraulicHummer = hasHydraulicHummer;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
