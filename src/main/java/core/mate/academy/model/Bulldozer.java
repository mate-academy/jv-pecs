package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeLength;
    private String[] optionalEquipment;

    public Bulldozer() {
    }

    public Bulldozer(int bladeLength, String[] optionalEquipment) {
        this.bladeLength = bladeLength;
        this.optionalEquipment = optionalEquipment;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
