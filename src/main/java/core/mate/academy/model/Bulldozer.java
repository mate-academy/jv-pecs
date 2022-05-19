package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean isCaterpillar;
    private int weigth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int weigth, boolean isCaterpillar) {
        this.setName(name);
        this.setColor(color);
        this.isCaterpillar = isCaterpillar;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
