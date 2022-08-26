package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int dozerBladeWidth;
    private int dozerBladeHeight;
    private String dozerBladeForm;

    public Bulldozer(int dozerBladeWidth, int dozerBladeHeight, String dozerBladeForm) {
        this.dozerBladeWidth = dozerBladeWidth;
        this.dozerBladeHeight = dozerBladeHeight;
        this.dozerBladeForm = dozerBladeForm;
    }

    public Bulldozer() {
    }

    public int getDozerBladeWidth() {
        return dozerBladeWidth;
    }

    public int getDozerBladeHeight() {
        return dozerBladeHeight;
    }

    public String getDozerBladeForm() {
        return dozerBladeForm;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
