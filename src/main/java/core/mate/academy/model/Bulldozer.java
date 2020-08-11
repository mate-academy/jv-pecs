package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String model;
    private String chassisType;

    public Bulldozer() {
    }

    public Bulldozer(String model, String chassisType) {
        this.model = model;
        this.chassisType = chassisType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
