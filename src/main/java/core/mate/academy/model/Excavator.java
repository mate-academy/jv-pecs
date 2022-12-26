package core.mate.academy.model;

public class Excavator extends Machine {
    private int rangeCran;
    private String nameWheels;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getRangeCran() {
        return rangeCran;
    }

    public void setRangeCran(int rangeCran) {
        this.rangeCran = rangeCran;
    }

    public String getNameWheels() {
        return nameWheels;
    }

    public void setNameWheels(String nameWheels) {
        this.nameWheels = nameWheels;
    }
}
