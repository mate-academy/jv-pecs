package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String chassis;

    public Bulldozer(String name, String color, String chassis) {
        super(name, color);
        this.chassis = chassis;
    }

    public Bulldozer() {
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
