package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String workEquipmentType;
    private String controlSystem;
    private String specialFeatures;

    public Bulldozer() {
    }

    public Bulldozer(String workEquipmentType,
                     String controlSystem, String specialFeatures) {
        this.workEquipmentType = workEquipmentType;
        this.controlSystem = controlSystem;
        this.specialFeatures = specialFeatures;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
