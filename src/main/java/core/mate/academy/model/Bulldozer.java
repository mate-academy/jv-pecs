package core.mate.academy.model;

import java.util.Objects;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public int hashCode() {
        int hash = 13;
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
        Bulldozer checkedBulldozer = (Bulldozer) obj;
        return Objects.equals(getName(), checkedBulldozer.getName())
                && Objects.equals(getColor(), checkedBulldozer.getColor());
    }

    @Override
    public String toString() {
        return "Bulldozer " + getName() + ", " + getColor() + " color";
    }
}
