package core.mate.academy.model;

public class Excavator extends Machine {
    private int createYear;

    public Excavator() {
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
