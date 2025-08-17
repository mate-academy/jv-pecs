package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String colorExcavator;
    private int powerExcavator;
    private String model;

    public Excavator(String colorExcavator, int powerExcavator, String model) {
        this.colorExcavator = colorExcavator;
        this.powerExcavator = powerExcavator;
        this.model = model;
    }

    public Excavator() {
    }

    public String getColorExcavator() {
        return colorExcavator;
    }

    public void setColorExcavator(String colorExcavator) {
        this.colorExcavator = colorExcavator;
    }

    public int getPowerExcavator() {
        return powerExcavator;
    }

    public void setPowerExcavator(int powerExcavator) {
        this.powerExcavator = powerExcavator;
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
