package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int ipn;
    private String name;
    public Bulldozer() {
    }
    public Bulldozer(int ipn, String name) {
        this.ipn = ipn;
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
