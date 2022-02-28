package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String ladle;
    private String caterpillars;

    public Bulldozer(String ladle, String caterpillars) {
        this.ladle = ladle;
        this.caterpillars = caterpillars;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getLadle() {
        return ladle;
    }

    public void setLadle(String ladle) {
        this.ladle = ladle;
    }

    public String getCaterpillars() {
        return caterpillars;
    }

    public void setCaterpillars(String caterpillars) {
        this.caterpillars = caterpillars;
    }

    @Override
    public String toString() {
        return "Bulldozer{" + "ladle='"
                + ladle + '\''
                + ", caterpillars='"
                + caterpillars + '\'' + '}';
    }
}

