package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private double liftingBlade;
    private double loweringBlade;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color) {
        super(name, color);
    }

    public Bulldozer(
            String name, String color, String bladeType,
            double liftingBlade, double loweringBlade) {
        super(name, color);
        this.bladeType = bladeType;
        this.liftingBlade = liftingBlade;
        this.loweringBlade = loweringBlade;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public double getLiftingBlade() {
        return liftingBlade;
    }

    public void setLiftingBlade(double liftingBlade) {
        this.liftingBlade = liftingBlade;
    }

    public double getLoweringBlade() {
        return loweringBlade;
    }

    public void setLoweringBlade(double loweringBlade) {
        this.loweringBlade = loweringBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
