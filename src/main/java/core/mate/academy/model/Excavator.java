package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator Do not remove no-args constructor
 */
public class Excavator extends Machine {
    
    private String scoopType;
    private double scoopWeight;
    private boolean scoopActive;
    
    public Excavator() {
    }
    
    public Excavator(String scoopType, double scoopWeight, boolean scoopActive) {
        this.scoopType = scoopType;
        this.scoopWeight = scoopWeight;
        this.scoopActive = scoopActive;
    }
    
    public String getScoopType() {
        return scoopType;
    }
    
    public void setScoopType(String scoopType) {
        this.scoopType = scoopType;
    }
    
    public double getScoopWeight() {
        return scoopWeight;
    }
    
    public void setScoopWeight(double scoopWeight) {
        this.scoopWeight = scoopWeight;
    }
    
    public boolean isScoopActive() {
        return scoopActive;
    }
    
    public void setScoopActive(boolean scoopActive) {
        this.scoopActive = scoopActive;
    }
    
    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
