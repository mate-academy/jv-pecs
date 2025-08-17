package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String model;
    private int horsepower;

    public Bulldozer() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
