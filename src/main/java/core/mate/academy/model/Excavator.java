package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private String model;
    private int liftHeight;

    public Excavator() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLiftHeight() {
        return liftHeight;
    }

    public void setLiftHeight(int liftHeight) {
        this.liftHeight = liftHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
