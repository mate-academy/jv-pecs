package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int clearArea;

    public Bulldozer() {
    }

    public Bulldozer(int clearArea) {
        this.clearArea = clearArea;
    }

    public int getClearArea() {
        return clearArea;
    }

    public void setClearArea(int clearArea) {
        this.clearArea = clearArea;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
