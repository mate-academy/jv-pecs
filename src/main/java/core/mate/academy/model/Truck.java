package core.mate.academy.model;

public class Truck extends Machine {
    private int truckId;
    private String model;

    public Truck() {
    }

    public Truck(int truckId, String model) {
        this.truckId = truckId;
        this.model = model;
    }

    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Truck{"
                + "truck_id=" + truckId
                + ", model='" + model
                + '\'' + '}';
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
