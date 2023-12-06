package core.mate.academy.model;

public class Bulldozer extends Machine {
    private Double bladeWidth;
    private Integer cabCapacity;

    public Bulldozer() {
    }

    public Bulldozer(Double bladeWidth, Integer cabCapacity) {
        this.bladeWidth = bladeWidth;
        this.cabCapacity = cabCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public Double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(Double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getCabCapacity() {
        return cabCapacity;
    }

    public void setCabCapacity(int cabCapacity) {
        this.cabCapacity = cabCapacity;
    }
}
