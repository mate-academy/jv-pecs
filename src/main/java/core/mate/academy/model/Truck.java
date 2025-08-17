package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String scale;
    
    public Truck() {
    }
    
    public String getScale() {
        return scale;
    }
    
    public void setScale(String scale) {
        this.scale = scale;
    }
    
    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
