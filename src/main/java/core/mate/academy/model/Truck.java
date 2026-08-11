package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String cabin;
    private int semiTrailer;

    public Truck() {
    }

    public Truck(String cabin, int semiTrailer) {
        this.cabin = cabin;
        this.semiTrailer = semiTrailer;
    }

    public int getSemiTrailer() {
        return semiTrailer;
    }

    public void setSemiTrailer(int semiTrailer) {
        this.semiTrailer = semiTrailer;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
