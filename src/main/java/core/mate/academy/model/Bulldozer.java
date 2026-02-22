package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerName;

    public Bulldozer() {
        bulldozerName = "Przemek";
    }

    public String getBulldozerName() {
        return bulldozerName;
    }

    public void setBulldozerName(String bulldozerName) {
        this.bulldozerName = bulldozerName;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
