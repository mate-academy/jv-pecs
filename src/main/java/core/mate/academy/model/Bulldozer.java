package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerModel;
    private int bulldozerAge;

    public Bulldozer() {
    }

    public Bulldozer(String bulldozerModel, int bulldozerAge) {
        this.bulldozerModel = bulldozerModel;
        this.bulldozerAge = bulldozerAge;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getBulldozerModel() {
        return bulldozerModel;
    }

    public void setBulldozerModel(String bulldozerModel) {
        this.bulldozerModel = bulldozerModel;
    }

    public int getBulldozerAge() {
        return bulldozerAge;
    }

    public void setBulldozerAge(int bulldozerAge) {
        this.bulldozerAge = bulldozerAge;
    }
}
