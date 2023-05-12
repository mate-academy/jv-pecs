package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bulldozerType;
    private int numOfAdditionalBulldozerEquipment;

    public Bulldozer() {
        super();
    }

    public Bulldozer(String bulldozerType,
                     String bulldozerName,
                     String color,
                     int numOfAdditionalBulldozerEquipment) {
        super(bulldozerName, color);
        this.bulldozerType = bulldozerType;
        this.numOfAdditionalBulldozerEquipment = numOfAdditionalBulldozerEquipment;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
