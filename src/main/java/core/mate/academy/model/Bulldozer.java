package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeOfBlade;
    private int tractiveForce;

    public Bulldozer() {
    }

    public String getTypeOfBlade() {
        return typeOfBlade;
    }

    public void setTypeOfBlade(String typeOfBlade) {
        this.typeOfBlade = typeOfBlade;
    }

    public int getTractiveForce() {
        return tractiveForce;
    }

    public void setTractiveForce(int tractiveForce) {
        this.tractiveForce = tractiveForce;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
