package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String type;
    private int weight;
    private int hrsPower;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getWeight() {
        return weight;
    }

    public int getHrsPower() {
        return hrsPower;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHrsPower(int hrsPower) {
        this.hrsPower = hrsPower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
