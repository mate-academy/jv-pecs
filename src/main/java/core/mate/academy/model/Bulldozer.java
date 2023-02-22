package core.mate.academy.model;

import java.util.Objects;

public class Bulldozer extends Machine {
    private boolean continuousTrack;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, boolean continuousTrack) {
        super(name, color);
        this.continuousTrack = continuousTrack;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public boolean isContinuousTrack() {
        return continuousTrack;
    }

    public void setContinuousTrack(boolean continuousTrack) {
        this.continuousTrack = continuousTrack;
    }

    @Override
    public String toString() {
        return "Bulldozer{" + "continuousTrack=" + continuousTrack + '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Bulldozer bulldozer = (Bulldozer) object;
        return continuousTrack == bulldozer.continuousTrack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(continuousTrack);
    }
}
