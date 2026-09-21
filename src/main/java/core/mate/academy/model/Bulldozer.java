package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bladeType;
    private int ripperShankCount;
    
    public Bulldozer() {
    }
    
    public String getBladeType() {
        return bladeType;
    }
    
    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }
    
    public int getRipperShankCount() {
        return ripperShankCount;
    }
    
    public void setRipperShankCount(int ripperShankCount) {
        this.ripperShankCount = ripperShankCount;
    }
    
    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
