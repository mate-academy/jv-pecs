package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    int ladleCapacity;
    boolean hasCaterpillar;

    public Bulldozer() {
    }

    public Bulldozer(int ladleCapacity, boolean hasCaterpillar) {
        this.ladleCapacity = ladleCapacity;
        this.hasCaterpillar = hasCaterpillar;
    }

    public void setLadleCapacity(int ladleCapacity) {
        this.ladleCapacity = ladleCapacity;
    }

    public int getLadleCapacity() {
        return ladleCapacity;
    }

    public void setHasCaterpillar(boolean hasCaterpillar) {
        this.hasCaterpillar = hasCaterpillar;
    }

    public boolean getHasCaterpillar() {
        return hasCaterpillar;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

}
