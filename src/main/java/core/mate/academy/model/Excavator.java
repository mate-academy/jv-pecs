package core.mate.academy.model;

public class Excavator extends Machine {
    private String usage;

    public Excavator() {
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
