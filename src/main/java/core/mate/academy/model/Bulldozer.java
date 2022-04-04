package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String ladleType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String ladleType) {
        super(name, color);
        this.ladleType = ladleType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getLadleType() {
        return ladleType;
    }

    public void setLadleType(String ladleType) {
        this.ladleType = ladleType;
    }
}
