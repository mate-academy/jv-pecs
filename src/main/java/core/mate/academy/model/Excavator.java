package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int volume;

    public Excavator() {
    }

    public Excavator(String name, String color, int horsePower) {
        super(color, name);
        this.volume = horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
