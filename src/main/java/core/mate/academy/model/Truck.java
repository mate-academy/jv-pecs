package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine {

    private int length;
    private int engineNumber;
    private String model;

    public Truck() {
    }

    public Truck(TruckBuilder truckBuilder) {
        this.length = truckBuilder.length;
        this.engineNumber = truckBuilder.engineNumber;
        this.model = truckBuilder.model;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public static class TruckBuilder {
        private int length;
        private int engineNumber;
        private String model;

        public TruckBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public TruckBuilder setEngineNumber(int engineNumber) {
            this.engineNumber = engineNumber;
            return this;
        }

        public TruckBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public Truck build() {
            return new Truck(this);
        }
    }
}
