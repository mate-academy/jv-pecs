package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private Integer power;

    public Bulldozer() {
    }

    public Bulldozer(Integer power, String name, String color) {
        this.power = power;
        setName(name);
        setColor(color);
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
