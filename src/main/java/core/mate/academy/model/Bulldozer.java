package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bladesTypes;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bladesTypes) {
        setName(name);
        setColor(color);
        this.bladesTypes = bladesTypes;
    }

    public String getBladesTypes() {
        return bladesTypes;
    }

    public void setBladesTypes(String bladesTypes) {
        this.bladesTypes = bladesTypes;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
