package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int productivity;
    private int workingTime;

    public Bulldozer() {
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
