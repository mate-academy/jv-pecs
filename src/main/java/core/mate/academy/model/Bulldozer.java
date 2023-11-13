package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeWidth;
    private int horsePower;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double bladeWidth, int horsePower) {
        super(name, color);
        this.bladeWidth = bladeWidth;
        this.horsePower = horsePower;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}

