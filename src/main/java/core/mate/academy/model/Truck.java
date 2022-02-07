package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckLength;
    private int qtyOfWheels;
    private String cargoType;

    public Truck() {
    }

    private Truck(int truckLength, int qtyOfWheels,String cargoType) {
        this.truckLength = truckLength;
        this.qtyOfWheels = qtyOfWheels;
        this.cargoType = cargoType;
    }

    public static Truck of(int truckLength, int qtyOfWheels,String cargoType) {
        return new Truck(truckLength,qtyOfWheels,cargoType);
    }

    public int getTruckLength() {
        return truckLength;
    }

    public void setTruckLength(int truckLength) {
        this.truckLength = truckLength;
    }

    public int getQtyOfWheels() {
        return qtyOfWheels;
    }

    public void setQtyOfWheels(int qtyOfWheels) {
        this.qtyOfWheels = qtyOfWheels;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
