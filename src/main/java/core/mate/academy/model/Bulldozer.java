package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int id;

    public Bulldozer() {
    }

    public Bulldozer(String name, int id) {
        super.setName(name);
        super.setColor("RED");
        this.id = id;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
