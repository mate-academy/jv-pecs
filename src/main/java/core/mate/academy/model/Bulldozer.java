package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String caterpillars;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String caterpillars) {
        setName(name);
        setColor(color);
        this.caterpillars = caterpillars;
    }

    public String getCaterpillars() {
        return caterpillars;
    }

    public void setCaterpillars(String caterpillars) {
        this.caterpillars = caterpillars;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

}
