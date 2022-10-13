package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int size;

    public Bulldozer() {
    }

    public Bulldozer(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
