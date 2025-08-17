package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int heapVolume;
    private int heapLength;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int heapVolume, int heapLength) {
        this.setName(name);
        this.setColor(name);
        this.heapVolume = heapVolume;
        this.heapLength = heapLength;
    }

    public int getHeapLength() {
        return heapLength;
    }

    public void setHeapLength(int heapLength) {
        this.heapLength = heapLength;
    }

    public int getHeapVolume() {
        return heapVolume;
    }

    public void setHeapVolume(int heapVolume) {
        this.heapVolume = heapVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
