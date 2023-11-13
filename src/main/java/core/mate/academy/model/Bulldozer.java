package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String undercarriage;
    private String dump;

    public Bulldozer() {
    }

    public Bulldozer(String undercarriage, String dump) {
        this.undercarriage = undercarriage;
        this.dump = dump;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
