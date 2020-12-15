package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean haveTrailer;

    public Truck() {
    }

    public Truck(String name, String color, boolean haveTrailer) {
        super(name, color);
        this.haveTrailer = haveTrailer;
    }

    public boolean isHaveTrailer() {
        return haveTrailer;
    }

    public void setHaveTrailer(boolean haveTrailer) {
        this.haveTrailer = haveTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
