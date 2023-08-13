package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double ladleWidth;
    private int horsePower;

    public Excavator() {
    }

    public Excavator(double ladleWidth, int horsePower) {
        this.ladleWidth = ladleWidth;
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getLadleWidth() {
        return ladleWidth;
    }

    public void setLadleWidth(double ladleWidth) {
        this.ladleWidth = ladleWidth;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
