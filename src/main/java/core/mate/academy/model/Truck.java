package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int hoursePowers;
    private String owner;

    public Truck() {
    }

    public Truck(String name, String color) {
        super(name, color);
    }

    public Truck(String name, String color, int hoursePowers, String owner) {
        super(name, color);
        this.hoursePowers = hoursePowers;
        this.owner = owner;
    }

    public int getHoursePowers() {
        return hoursePowers;
    }

    public String getOwner() {
        return owner;
    }

    public void setHoursePowers(int hoursePowers) {
        this.hoursePowers = hoursePowers;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
