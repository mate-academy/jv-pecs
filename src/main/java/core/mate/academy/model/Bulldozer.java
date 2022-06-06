package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int mass;
    private String shovelType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int mass, String shovelType) {
        super(name, color);
        this.mass = mass;
        this.shovelType = shovelType;
    }

    public void setShovelType(String shovelType) {
        this.shovelType = shovelType;
    }

    public String getShovelType() {
        return shovelType;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
