package core.mate.academy.model;

public class Excavator extends Machine {
    private String bladeType;
    private int bladeWidth;

    public Excavator() {
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
