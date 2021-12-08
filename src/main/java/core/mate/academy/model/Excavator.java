package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String boom;
    private String dipper;

    public Excavator() {
    }

    public String getBoom() {
        return boom;
    }

    public void setBoom(String boom) {
        this.boom = boom;
    }

    public String getDipper() {
        return dipper;
    }

    public void setDipper(String dipper) {
        this.dipper = dipper;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
