package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int caterPillar;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int caterPillar) {
        super(name, color);
        this.caterPillar = caterPillar;
    }

    public int getCaterPillar() {
        return caterPillar;
    }

    public void setCaterPillar(int caterPillar) {
        this.caterPillar = caterPillar;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "caterPillar=" + caterPillar
                + "} " + super.toString();
    }
}
