package core.mate.academy.model;

import java.util.Objects;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public int hashCode() {
        int hash = 15;
        hash *= 7 * getName().hashCode();
        hash *= 7 * getColor().hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Truck checkedTruck = (Truck) obj;
        return Objects.equals(getName(), checkedTruck.getName())
                && Objects.equals(getColor(), checkedTruck.getColor());
    }

    @Override
    public String toString() {
        return "Truck " + getName() + ", " + getColor() + " color";
    }
}
