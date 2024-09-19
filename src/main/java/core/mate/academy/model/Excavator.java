package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorMark;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getExcavatorMark() {
        return excavatorMark;
    }

    public void setExcavatorMark(String excavatorMark) {
        this.excavatorMark = excavatorMark;
    }
}
