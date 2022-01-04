package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorCustom1;
    private String excavatorCustom2;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getExcavatorCustom1() {
        return excavatorCustom1;
    }

    public void setExcavatorCustom1(String excavatorCustom1) {
        this.excavatorCustom1 = excavatorCustom1;
    }

    public String getExcavatorCustom2() {
        return excavatorCustom2;
    }

    public void setExcavatorCustom2(String excavatorCustom2) {
        this.excavatorCustom2 = excavatorCustom2;
    }
}
