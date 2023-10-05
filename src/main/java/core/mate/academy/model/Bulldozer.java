package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int year;
    private int kgOfMaterialCanForce;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
