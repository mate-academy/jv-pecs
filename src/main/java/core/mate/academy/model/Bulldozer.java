package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int workTimeHour;

    public Bulldozer() {
    }

    public int getWorkTimeHour() {
        return workTimeHour;
    }

    public void setWorkTimeHour(int workTimeHour) {
        this.workTimeHour = workTimeHour;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
