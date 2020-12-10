package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String superPower;
    private String logo;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String superPower, String logo) {
        super(name, color);
        this.superPower = superPower;
        this.logo = logo;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
