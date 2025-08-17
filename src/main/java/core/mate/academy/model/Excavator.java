package core.mate.academy.model;

import java.util.Objects;

public class Excavator extends Machine {
    private boolean backhoe;

    public Excavator() {
    }

    public Excavator(String name, String color, boolean backhoe) {
        super(name, color);
        this.backhoe = backhoe;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public boolean isBackhoe() {
        return backhoe;
    }

    public void setBackhoe(boolean backhoe) {
        this.backhoe = backhoe;
    }

    @Override
    public String toString() {
        return "Excavator{" + "backhoe=" + backhoe + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Excavator excavator = (Excavator) object;
        return backhoe == excavator.backhoe;
    }

    @Override
    public int hashCode() {
        return Objects.hash(backhoe);
    }
}
