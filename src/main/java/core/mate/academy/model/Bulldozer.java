package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String engineModel;
    private String cabinType;

    public Bulldozer(String engineModel, String cabinType) {
        this.engineModel = engineModel;
        this.cabinType = cabinType;
    }

    public Bulldozer() {
    }

    public String getCabinType() {
        return cabinType;
    }

    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
