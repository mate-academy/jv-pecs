package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int weightOfExcavator;
    private int heightOfExcavator;
    private int hoursOfWorkExcavator;

    public Excavator() {

    }

    public Excavator(String name, String color,
                     int weightOfExcavator, int heightOfExcavator, int hoursOfWorkExcavator) {
        super(name, color);
        this.weightOfExcavator = weightOfExcavator;
        this.heightOfExcavator = heightOfExcavator;
        this.hoursOfWorkExcavator = hoursOfWorkExcavator;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
