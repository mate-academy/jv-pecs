package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String scoop;
    private String caterpillar;
    private int passengers;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getScoop() {
        return scoop;
    }

    public void setScoop(String scoop) {
        this.scoop = scoop;
    }

    public String getCaterpillar() {
        return caterpillar;
    }

    public void setCaterpillar(String caterpillar) {
        this.caterpillar = caterpillar;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
