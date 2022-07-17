package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private Integer weight;

    public Excavator() {
    }

    public Excavator(Integer weight, String name, String color) {
        this.weight = weight;
        setName(name);
        setColor(color);
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
