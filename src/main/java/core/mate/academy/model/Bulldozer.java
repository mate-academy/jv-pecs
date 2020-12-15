package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int showelType;

    public Bulldozer() {

    }

    public int getShowelType() {
        return showelType;
    }

    public void setShowelType(int showelType) {
        this.showelType = showelType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
