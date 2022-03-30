package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String typeOfBlade;

    public Bulldozer() {
    }

    public Bulldozer(String typeOfBlade) {
        this.typeOfBlade = typeOfBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
