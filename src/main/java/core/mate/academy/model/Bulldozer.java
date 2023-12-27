package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double fromZeroToOneHundred;
    private String productionRegion;

    public Bulldozer() {

    }

    public Bulldozer(double fromZeroToOneHundred, String productionRegion) {
        this.fromZeroToOneHundred = fromZeroToOneHundred;
        this.productionRegion = productionRegion;
    }

    public double getFromZeroToOneHundred() {
        return fromZeroToOneHundred;
    }

    public void setFromZeroToOneHundred(double fromZeroToOneHundred) {
        this.fromZeroToOneHundred = fromZeroToOneHundred;
    }

    public String getProductionRegion() {
        return productionRegion;
    }

    public void setProductionRegion(String productionRegion) {
        this.productionRegion = productionRegion;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started working...");
    }
}
