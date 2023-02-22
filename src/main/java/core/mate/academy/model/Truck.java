package core.mate.academy.model;

import java.util.Objects;

public class Truck extends Machine {
    private boolean cargoPlatform;

    public Truck() {
    }

    public Truck(String name, String color, boolean cargoPlatform) {
        super(name, color);
        this.cargoPlatform = cargoPlatform;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public boolean isCargoPlatform() {
        return cargoPlatform;
    }

    public void setCargoPlatform(boolean cargoPlatform) {
        this.cargoPlatform = cargoPlatform;
    }

    @Override
    public String toString() {
        return "Truck{" + "cargoPlatform=" + cargoPlatform + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Truck truck = (Truck) object;
        return cargoPlatform == truck.cargoPlatform;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargoPlatform);
    }
}
