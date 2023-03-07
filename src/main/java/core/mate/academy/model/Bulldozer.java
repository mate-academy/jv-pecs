package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePowers;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String model, int year, int horsePowers) {
        super(name, color, model, year);
        this.horsePowers = horsePowers;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }
}
