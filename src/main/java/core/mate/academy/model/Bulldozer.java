package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeDesign;
    private boolean hasAssistingScrapers;

    public Bulldozer() {
    }

    public Bulldozer(String bladeDesign, boolean hasAssistingScrapers) {
        this.bladeDesign = bladeDesign;
        this.hasAssistingScrapers = hasAssistingScrapers;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
