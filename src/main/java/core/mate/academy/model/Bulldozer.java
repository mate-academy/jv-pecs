package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerModel;
    private int bladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(String bulldozerModel, int bladeWidth) {
        this.bulldozerModel = bulldozerModel;
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
