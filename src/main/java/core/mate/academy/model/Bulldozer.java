package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int sizeOfShovel;
    private String typeOfShovel;

    public Bulldozer() {
    }

    public int getSizeOfShovel() {
        return sizeOfShovel;
    }

    public void setSizeOfShovel(int sizeOfShovel) {
        this.sizeOfShovel = sizeOfShovel;
    }

    public String getTypeOfShovel() {
        return typeOfShovel;
    }

    public void setTypeOfShovel(String typeOfShovel) {
        this.typeOfShovel = typeOfShovel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
