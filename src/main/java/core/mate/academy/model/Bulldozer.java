package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int areaOfPlate;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int areaOfPlate) {
        super(name, color);
        this.areaOfPlate = areaOfPlate;
    }

    public int getAreaOfPlate() {
        return areaOfPlate;
    }

    public void setAreaOfPlate(int areaOfPlate) {
        this.areaOfPlate = areaOfPlate;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
