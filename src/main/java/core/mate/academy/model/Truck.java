package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeTrailer;

    public Truck() {
    }

    public String getTypeTrailer() {
        return typeTrailer;
    }

    public void setTypeTrailer(String typeTrailer) {
        this.typeTrailer = typeTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
