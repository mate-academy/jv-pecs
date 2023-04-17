package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String dozerBladeType;
    private int dozerBladeLength;

    public Bulldozer() {
    }

    public String getDozerBladeType() {
        return dozerBladeType;
    }

    public void setDozerBladeType(String dozerBladeType) {
        this.dozerBladeType = dozerBladeType;
    }

    public int getDozerBladeLength() {
        return dozerBladeLength;
    }

    public void setDozerBladeLength(int dozerBladeLength) {
        this.dozerBladeLength = dozerBladeLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
