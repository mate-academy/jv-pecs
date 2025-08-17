package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean isLoader;

    public Excavator(boolean isLoader) {
        this.isLoader = isLoader;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public boolean isLoader() {
        return isLoader;
    }

    public void setLoader(boolean loader) {
        isLoader = loader;
    }

    @Override
    public String toString() {
        return "Excavator{" + "isLoader=" + isLoader + '}';
    }
}
