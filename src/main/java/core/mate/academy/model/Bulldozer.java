package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeBlade;

    public Bulldozer() {
    }

    public String getTypeBlade() {
        return typeBlade;
    }

    public void setTypeBlade(String typeBlade) {
        this.typeBlade = typeBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
