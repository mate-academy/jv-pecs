package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bumperSize;

    public Bulldozer() {
    }

    public void setBumperSize(int bumperSize) {
        this.bumperSize = bumperSize;
    }

    public int getBumperSize() {
        return bumperSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
