package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String tractionClass;
    private String groundPressure;

    public Bulldozer() {
    }

    public Bulldozer(String color, String name, String tractionClass, String groundPressure) {
        this.tractionClass = tractionClass;
        this.groundPressure = groundPressure;
        setName(name);
        setColor(color);
    }

    public String getTractionClass() {
        return tractionClass;
    }

    public String getGroundPressure() {
        return groundPressure;
    }

    public void setTractionClass(String tractionClass) {
        this.tractionClass = tractionClass;
    }

    public void setGroundPressure(String groundPressure) {
        this.groundPressure = groundPressure;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
