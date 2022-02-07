package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private int bladePressure;
    private String wheelTypes;

    public Bulldozer() {
    }

    private Bulldozer(int bladePower, String wheelTypes) {
        this.bladePressure = bladePower;
        this.wheelTypes = wheelTypes;
    }

    public static Bulldozer of(int bladePressure, String wheelTypes) {
        return new Bulldozer(bladePressure,wheelTypes);
    }

    public int getBladePressure() {
        return bladePressure;
    }

    public void setBladePressure(int bladePressure) {
        this.bladePressure = bladePressure;
    }

    public String getWheelTypes() {
        return wheelTypes;
    }

    public void setWheelTypes(String wheelTypes) {
        this.wheelTypes = wheelTypes;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
