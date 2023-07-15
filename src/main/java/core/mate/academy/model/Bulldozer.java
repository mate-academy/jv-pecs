package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bulldozerId;
    private String bulldozerModel;

    public Bulldozer() {
    }

    public Bulldozer(int bulldozerId, String bulldozerModel) {
        this.bulldozerId = bulldozerId;
        this.bulldozerModel = bulldozerModel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getBulldozerId() {
        return bulldozerId;
    }

    public void setBulldozerId(int bulldozerId) {
        this.bulldozerId = bulldozerId;
    }

    public String getBulldozerModel() {
        return bulldozerModel;
    }

    public void setBulldozerModel(String bulldozerModel) {
        this.bulldozerModel = bulldozerModel;
    }
}
