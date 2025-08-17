package core.mate.academy.model;

public class Excavator extends Machine {
    private String chassisType;
    private String engineType;

    public Excavator(String name, String color, String chassisType, String engineType) {
        super(name, color);
        this.chassisType = chassisType;
        this.engineType = engineType;
    }

    public Excavator() {
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
