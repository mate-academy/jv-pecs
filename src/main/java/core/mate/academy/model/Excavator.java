package core.mate.academy.model;

public class Excavator extends Machine {
    private String excavatorCustomString;
    private int excavatorCustomInt;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getExcavatorCustomString() {
        return excavatorCustomString;
    }

    public void setExcavatorCustomString(String excavatorCustomString) {
        this.excavatorCustomString = excavatorCustomString;
    }

    public int getExcavatorCustomInt() {
        return excavatorCustomInt;
    }

    public void setExcavatorCustomInt(int excavatorCustomInt) {
        this.excavatorCustomInt = excavatorCustomInt;
    }
}
