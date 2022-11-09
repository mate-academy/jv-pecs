package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeOfBulldozer;

    public Bulldozer() {
    }

    public String getTypeOfBulldozer() {
        return typeOfBulldozer;
    }

    public void setTypeOfBulldozer(String typeOfBulldozer) {
        this.typeOfBulldozer = typeOfBulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
