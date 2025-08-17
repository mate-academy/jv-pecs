package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfFuel;
    private int tankVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, String typeOfFuel, int tankVolume) {
        super.setName(name);
        super.setColor(color);
        this.typeOfFuel = typeOfFuel;
        this.tankVolume = tankVolume;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
