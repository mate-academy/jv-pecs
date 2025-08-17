package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String colorTruck;
    private int powerTruck;
    private String model;
    private int weight;

    public Bulldozer(String colorTruck, int powerTruck, String model, int weight) {
        this.colorTruck = colorTruck;
        this.powerTruck = powerTruck;
        this.model = model;
        this.weight = weight;
    }

    public Bulldozer() {
    }

    public String getColorTruck() {
        return colorTruck;
    }

    public void setColorTruck(String colorTruck) {
        this.colorTruck = colorTruck;
    }

    public int getPowerTruck() {
        return powerTruck;
    }

    public void setPowerTruck(int powerTruck) {
        this.powerTruck = powerTruck;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
