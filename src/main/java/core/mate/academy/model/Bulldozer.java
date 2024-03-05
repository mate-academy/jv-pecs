package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int pouwer;

    public Bulldozer() {

    }

    public Bulldozer(String color, String name, int pouwer) {
        setColor(color);
        setName(name);
        this.pouwer = pouwer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getPouwer() {
        return pouwer;
    }

    public void setPouwer(int pouwer) {
        this.pouwer = pouwer;
    }
}
