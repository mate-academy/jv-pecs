package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeChassis;

    public Bulldozer() {

    }

    public Bulldozer(String color, String name, String typeChassis) {
        setColor(color);
        setName(name);
        this.typeChassis = typeChassis;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getTypeChassis() {
        return typeChassis;
    }

    public void setTypeChassis(String typeChassis) {
        this.typeChassis = typeChassis;
    }
}
