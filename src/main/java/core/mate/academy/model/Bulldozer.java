package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean isTracked;
    private String tractionClass;

    public Bulldozer() {
    }

    public Bulldozer(boolean isTracked, String tractionClass, String name, String color) {
        this.isTracked = isTracked;
        this.tractionClass = tractionClass;
        setName(name);
        setColor(color);
    }

    public boolean isTracked() {
        return isTracked;
    }

    public void setTracked(boolean tracked) {
        isTracked = tracked;
    }

    public String getTractionClass() {
        return tractionClass;
    }

    public void setTractionClass(String tractionClass) {
        this.tractionClass = tractionClass;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
