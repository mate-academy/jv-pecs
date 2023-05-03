package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorType;
    private int numOfAdditionalExcavatorEquipment;

    public Excavator() {
        super();
    }

    public Excavator(String excavatorType,
                     String excavatorName,
                     String color,
                     int numOfAdditionalExcavatorEquipment) {
        super(excavatorName, color);
        this.excavatorType = excavatorType;
        this.numOfAdditionalExcavatorEquipment = numOfAdditionalExcavatorEquipment;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
