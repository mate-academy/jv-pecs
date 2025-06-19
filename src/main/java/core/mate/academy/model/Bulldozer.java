package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    
    private String bladeType;
    private double bladeWeight;
    private boolean hasRipper;
    
    public Bulldozer() {
    }
    
    public Bulldozer(String bladeType, double bladeWeight, boolean hasRipper) {
        this.bladeType = bladeType;
        this.bladeWeight = bladeWeight;
        this.hasRipper = hasRipper;
    }
    
    public String getBladeType() {
        return bladeType;
    }
    
    public double getBladeWeight() {
        return bladeWeight;
    }
    
    public boolean hasRipper() {
        return hasRipper;
    }
    
    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }
    
    public void setBladeWeight(double bladeWeight) {
        this.bladeWeight = bladeWeight;
    }
    
    public void setHasRipper(boolean hasRipper) {
        this.hasRipper = hasRipper;
    }
    
    @Override
    public void doWork() {
        System.out.println("Bulldozer is pushing soil with blade: " + bladeType);
    }
}
