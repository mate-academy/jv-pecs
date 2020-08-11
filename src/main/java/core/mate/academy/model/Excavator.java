package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int diggingDepth;
    private int dischargeHeight;

    public Excavator() {
    }

    public Excavator(int diggingDepth, int dischargeHeight) {
        this.diggingDepth = diggingDepth;
        this.dischargeHeight = dischargeHeight;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public int getDiggingDepth() {
        return diggingDepth;
    }

    public void setDischargeHeight(int dischargeHeight) {
        this.dischargeHeight = dischargeHeight;
    }

    public int getDischargeHeight() {
        return dischargeHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
