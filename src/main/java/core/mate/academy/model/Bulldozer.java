package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String model;
    private String countryOfProduction;

    public Bulldozer() {

    }

    public Bulldozer(String model, String countryOfProduction) {
        this.model = model;
        this.countryOfProduction = countryOfProduction;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
