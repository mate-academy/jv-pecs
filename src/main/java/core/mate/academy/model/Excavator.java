package core.mate.academy.model;

public class Excavator extends Machine {
    private float diggingDepth;

    public Excavator() {
    }

    public Excavator(String name,String color,float diggingDepth) {
        super();
        this.setName(name);
        this.setColor(color);
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public float getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(float diggingDepth) {
        this.diggingDepth = diggingDepth;
    }
}
