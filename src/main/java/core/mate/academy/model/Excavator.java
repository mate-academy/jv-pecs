package core.mate.academy.model;

public class Excavator extends Machine {
    private String typeByUsage;
    private String armType;

    public Excavator() {
    }

    public Excavator(String color, String name, String typeByUsage, String armType) {
        setColor(color);
        setName(name);
        this.typeByUsage = typeByUsage;
        this.armType = armType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
