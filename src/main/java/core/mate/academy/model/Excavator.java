package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String hydraulicTank;
    private String differential;

    public Excavator() {
    }

    public String getHydraulicTank() {
        return hydraulicTank;
    }

    public void setHydraulicTank(String hydraulicTank) {
        this.hydraulicTank = hydraulicTank;
    }

    public String getDifferential() {
        return differential;
    }

    public void setDifferential(String differential) {
        this.differential = differential;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
