package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int cuttingDepth;
    private String bladeManagement;

    public Bulldozer() {
    }

    public int getCuttingDepth() {
        return cuttingDepth;
    }

    public void setCuttingDepth(int cuttingDepth) {
        this.cuttingDepth = cuttingDepth;
    }

    public String getBladeManagement() {
        return bladeManagement;
    }

    public void setBladeManagement(String bladeManagement) {
        this.bladeManagement = bladeManagement;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

}
