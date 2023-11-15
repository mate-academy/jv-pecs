package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePower;
    private String nameOfBulldozer;

    public Bulldozer(int horsePower, String nameOfBulldozer) {
        this.nameOfBulldozer = nameOfBulldozer;
        this.horsePower = horsePower;
    }

    public Bulldozer() {
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getNameOfBulldozer() {
        return nameOfBulldozer;
    }

    public void setNameOfBulldozer(String nameOfBulldozer) {
        this.nameOfBulldozer = nameOfBulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
