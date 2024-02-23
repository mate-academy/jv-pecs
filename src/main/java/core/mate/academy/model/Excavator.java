package core.mate.academy.model;

public class Excavator extends Machine {
    private String excavationType;
    private int diggingDepth;

    public Excavator() {
    }

    public String getExcavationType() {
        return excavationType;
    }

    public void setExcavationType(String excavationType) {
        this.excavationType = excavationType;
    }

    public int getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
