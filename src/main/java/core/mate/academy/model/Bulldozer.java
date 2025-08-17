package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String cabinType;
    private String caterpillarType;

    public Bulldozer() {
    }

    public Bulldozer(String cabinType, String caterpillarType) {
        this.cabinType = cabinType;
        this.caterpillarType = caterpillarType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
