package core.mate.academy.model;

import java.util.Objects;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public int hashCode() {
        int hash = 11;
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
        Excavator checkedExcavator = (Excavator) obj;
        return Objects.equals(getName(), checkedExcavator.getName())
                && Objects.equals(getColor(), checkedExcavator.getColor());
    }

    @Override
    public String toString() {
        return "Excavator " + getName() + ", " + getColor() + " color";
    }
}
