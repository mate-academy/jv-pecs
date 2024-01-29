package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int horsepower;
    private String manufacturer;

    public Excavator() {
    }

    public Excavator(String name, int horsepower, String manufacturer, String color) {
        this.setName(name);
        this.horsepower = horsepower;
        this.manufacturer = manufacturer;
        this.setColor(color);
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
