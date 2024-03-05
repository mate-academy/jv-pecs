package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean hasHummer;

    public Excavator() {

    }

    public Excavator(String color, String name, boolean hasHummer) {
        setColor(color);
        setName(name);
        this.hasHummer = hasHummer;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public boolean getHasHummer() {
        return hasHummer;
    }

    public void setHasHummer(boolean hasHummer) {
        this.hasHummer = hasHummer;
    }
}
