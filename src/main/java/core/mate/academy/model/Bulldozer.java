package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int capacity;
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(int capacity, String model) {
        this.capacity = capacity;
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Bulldozer bulldozer = (Bulldozer) o;

        if (capacity != bulldozer.capacity) {
            return false;
        }
        return model.equals(bulldozer.model);
    }

    @Override
    public int hashCode() {
        int result = capacity;
        result = 31 * result + model.hashCode();
        return result;
    }
}
