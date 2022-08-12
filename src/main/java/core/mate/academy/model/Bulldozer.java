package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private int paramBull1;
    private String paramBull2;

    public Bulldozer() {
    }

    public Bulldozer(String color, String name, int paramBull1, String paramBull2) {
        super(color, name);
        this.paramBull1 = paramBull1;
        this.paramBull2 = paramBull2;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
