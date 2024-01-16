package core.mate.academy.model;

public class Excavator extends Machine {
    private String color;
    private int horsePower;
    private int liftingLimit;

    public Excavator() {
    }

    public Excavator(String color, int horsePower, int liftingLimit) {
        this.color = getColor();
        this.horsePower = getHorsePower();
        this.liftingLimit = getLiftingLimit();
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getLiftingLimit() {
        return liftingLimit;
    }

    public void setLiftingLimit(int liftingLimit) {
        this.liftingLimit = liftingLimit;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
