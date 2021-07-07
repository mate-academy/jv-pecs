package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String countryOfProduction;

    public Bulldozer() {

    }

    public Bulldozer(String model, String name, String color, String countryOfProduction) {
        super(model, name, color);
        this.countryOfProduction = countryOfProduction;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
