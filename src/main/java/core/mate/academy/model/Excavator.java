package core.mate.academy.model;

public class Excavator extends Machine {
    private String excavatorType;
    private int equipmentCount;

    public Excavator() {
        super();
    }

    public Excavator(String excavatorType,
                     String excavatorName,
                     String color,
                     int equipmentCount) {
        super(excavatorName, color);
        this.excavatorType = excavatorType;
        this.equipmentCount = equipmentCount;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
