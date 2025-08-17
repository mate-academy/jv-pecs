package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int wheels;
    private String model;

    public Truck() {
    }

    public Truck(int wheels, String model) {
        this.wheels = wheels;
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Truck truck = (Truck) o;

        if (wheels != truck.wheels) {
            return false;
        }
        return model.equals(truck.model);
    }

    @Override
    public int hashCode() {
        int result = wheels;
        result = 31 * result + model.hashCode();
        return result;
    }
}
