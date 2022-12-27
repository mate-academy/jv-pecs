package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String typeOfTransmission;
    private int operatingWeight;
    private String engineModel;

    public Bulldozer() {
    }

    public Bulldozer(String typeOfTransmission, int operatingWeightKg, String engineModel) {
        this.typeOfTransmission = typeOfTransmission;
        this.operatingWeight = operatingWeightKg;
        this.engineModel = engineModel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    public int getOperatingWeightKg() {
        return operatingWeight;
    }

    public void setOperatingWeightKg(int operatingWeightKg) {
        this.operatingWeight = operatingWeightKg;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }
}
