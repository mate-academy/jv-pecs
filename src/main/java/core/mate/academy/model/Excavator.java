package core.mate.academy.model;

public class Excavator extends Machine {
    private String boomType;
    private int counterWeight;

    public Excavator() {
    }

    public String getBoomType() {
        return boomType;
    }

    public void setBoomType(String boomType) {
        this.boomType = boomType;
    }

    public int getCounterWeight() {
        return counterWeight;
    }

    public void setCounterWeight(int counterWeight) {
        this.counterWeight = counterWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
