package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int weight;
    private int hydraulicPower;
    private String name;
    private String color;

    public Excavator() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getHydraulicPower() {
        return hydraulicPower;
    }

    public void setHydraulicPower(int hydraulicPower) {
        this.hydraulicPower = hydraulicPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
