package core.mate.academy.model;

public class Bulldozer extends Machine {
    private final String bulldozerModel;
    private final String countryOfProduction;

    public Bulldozer() {
        this.bulldozerModel = "Model Two";
        this.countryOfProduction = "Belarus";
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
