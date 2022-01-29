package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String ladleType;
    private int serialNumber;

    public Bulldozer() {
    }

    public Bulldozer(String ladleType, int serialNumber) {
        this.ladleType = ladleType;
        this.serialNumber = serialNumber;
    }

    public String getLadleType() {
        return ladleType;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
