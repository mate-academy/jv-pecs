package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String chainType;

    public Excavator() {
        super();
    }

    public Excavator(String bull1, String red, String chainType) {
        super(bull1, red);
        this.chainType = chainType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
