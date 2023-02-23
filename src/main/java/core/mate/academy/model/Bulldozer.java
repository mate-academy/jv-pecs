package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bulldozerCustomString;
    private int bulldozerCustomInt;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getBulldozerCustomString() {
        return bulldozerCustomString;
    }

    public void setBulldozerCustomString(String bulldozerCustomString) {
        this.bulldozerCustomString = bulldozerCustomString;
    }

    public int getBulldozerCustomInt() {
        return bulldozerCustomInt;
    }

    public void setBulldozerCustomInt(int bulldozerCustomInt) {
        this.bulldozerCustomInt = bulldozerCustomInt;
    }
}
