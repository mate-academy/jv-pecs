package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorType;
    private int plantPower;

    public Excavator() {
    }

    public Excavator(String excavatorType, int plantPower) {
        this.excavatorType = excavatorType;
        this.plantPower = plantPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getExcavatorType() {
        return excavatorType;
    }

    public void setExcavatorType(String excavatorType) {
        this.excavatorType = excavatorType;
    }

    public int getPlantPower() {
        return plantPower;
    }

    public void setPlantPower(int plantPower) {
        this.plantPower = plantPower;
    }
}
