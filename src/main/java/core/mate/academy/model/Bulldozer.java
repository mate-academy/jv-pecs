package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String typeOfBlade;
    private double bladeLiftHeight;

    public Bulldozer() {
    }

    public Bulldozer(String typeOfBlade, double bladeLiftHeight) {
        this.typeOfBlade = typeOfBlade;
        this.bladeLiftHeight = bladeLiftHeight;
    }

    public String getTypeOfBlade() {
        return typeOfBlade;
    }

    public void setTypeOfBlade(String typeOfBlade) {
        this.typeOfBlade = typeOfBlade;
    }

    public double getBladeLiftHeight() {
        return bladeLiftHeight;
    }

    public void setBladeLiftHeight(double bladeLiftHeight) {
        this.bladeLiftHeight = bladeLiftHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
