package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String model;
    private String ladle;

    public Excavator(String model, String ladle) {
        this.model = model;
        this.ladle = ladle;
    }

    public Excavator() {
    }

    public String getLadle() {
        return ladle;
    }

    public void setLadle(String ladle) {
        this.ladle = ladle;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
