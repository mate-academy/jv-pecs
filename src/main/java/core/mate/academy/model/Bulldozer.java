package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int power;
    private double bladeVolume;
    private boolean isCrawler;

    public Bulldozer(String name, String colour, int power, double bladeVolume, boolean isCrawler) {
        setName(name);
        setColor(colour);
        this.power = power;
        this.bladeVolume = bladeVolume;
        this.isCrawler = isCrawler;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
