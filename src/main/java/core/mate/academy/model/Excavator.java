package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String backhoeSize;

    public Excavator() {
    }

    public String getBackhoeSize() {
        return backhoeSize;
    }

    public void setBackhoeSize(String backhoeSize) {
        this.backhoeSize = backhoeSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
