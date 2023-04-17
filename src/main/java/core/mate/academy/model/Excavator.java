package core.mate.academy.model;

public class Excavator extends Machine {
    private String ladleType;
    private int ladleLength;

    public Excavator() {
    }

    public String getLadleType() {
        return ladleType;
    }

    public void setLadleType(String ladleType) {
        this.ladleType = ladleType;
    }

    public int getLadleLength() {
        return ladleLength;
    }

    public void setLadleLength(int ladleLength) {
        this.ladleLength = ladleLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
