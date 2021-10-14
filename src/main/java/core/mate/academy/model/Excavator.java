package core.mate.academy.model;

public class Excavator extends Machine {
    private int maxDeep;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void setMaxDeep(int maxDeep) {
        this.maxDeep = maxDeep;
    }
}
