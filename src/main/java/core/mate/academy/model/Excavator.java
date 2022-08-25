package core.mate.academy.model;

public class Excavator extends Machine {
    private int excInt;
    private String excStr;
    private boolean excBool;

    public Excavator() {

    }

    public Excavator(int excInt, String excStr, boolean excBool) {
        this.excInt = excInt;
        this.excStr = excStr;
        this.excBool = excBool;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
