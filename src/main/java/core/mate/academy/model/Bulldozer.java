package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String tractionClass;
    private String typeBlade;
    private double bladeLength;
    private double bladeHeight;

    public Bulldozer(String tractionClass, String typeBlade,
                     double bladeLength, double bladeHeight) {
        this.tractionClass = tractionClass;
        this.typeBlade = typeBlade;
        this.bladeLength = bladeLength;
        this.bladeHeight = bladeHeight;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getTractionClass() {
        return tractionClass;
    }

    public void setTractionClass(String tractionClass) {
        this.tractionClass = tractionClass;
    }

    public String getTypeBlade() {
        return typeBlade;
    }

    public void setTypeBlade(String typeBlade) {
        this.typeBlade = typeBlade;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public double getBladeHeight() {
        return bladeHeight;
    }

    public void setBladeHeight(double bladeHeight) {
        this.bladeHeight = bladeHeight;
    }
}
