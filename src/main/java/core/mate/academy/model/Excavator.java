package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int horsePower;
    private String nameOfBulldozer;

    public Excavator(int horsePower, String nameOfBulldozer) {
        this.horsePower = horsePower;
        this.nameOfBulldozer = nameOfBulldozer;
    }

    public Excavator() {
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
        System.out.println("Excavator started to work");
    }
}
