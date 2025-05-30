package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeWidth;
    private int horsepower;

    public Bulldozer() {
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
