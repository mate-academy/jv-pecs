package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePower;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int horsePower) {
        this.setName(name);
        this.setColor(color);
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
