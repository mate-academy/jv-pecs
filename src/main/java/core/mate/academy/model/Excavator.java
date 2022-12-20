package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String color;
    private int weight;
    private int hrsPower;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getHrsPower() {
        return hrsPower;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHrsPower(int hrsPower) {
        this.hrsPower = hrsPower;
    }
}
