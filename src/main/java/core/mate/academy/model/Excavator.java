package core.mate.academy.model;

public class Excavator extends Machine {
    private int createYear;

    public Excavator() {
    }

    public Excavator(String name, String color, int createYear) {
        super(name, color);
        this.createYear = createYear;
    }

    public int getCreateYear() {
        return createYear;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
