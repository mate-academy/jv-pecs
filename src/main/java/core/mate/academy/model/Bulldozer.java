package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
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
