package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfChassis;
    private double diggingDepth;
    private boolean hasHydraulicHummer;

    private Excavator(String name, String color, String typeOfChassis,
                      double diggingDepth, boolean hasHydraulicHummer) {
        super(name, color);
        this.typeOfChassis = typeOfChassis;
        this.diggingDepth = diggingDepth;
        this.hasHydraulicHummer = hasHydraulicHummer;
    }

    public String getTypeOfChassis() {
        return typeOfChassis;
    }

    public void setTypeOfChassis(String typeOfChassis) {
        this.typeOfChassis = typeOfChassis;
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
