package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String typeOfBlade;

    public Bulldozer() {

    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getTypeOfBlade() {
        return typeOfBlade;
    }

    public void setTypeOfBlade(String typeOfBlade) {
        this.typeOfBlade = typeOfBlade;
    }
}
