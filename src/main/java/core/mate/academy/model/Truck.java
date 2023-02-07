package core.mate.academy.model;

public class Truck extends Machine {
    private String type;
    private int weight;
    private int enginePower;
    private int loadingCapacity;

    public Truck() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
