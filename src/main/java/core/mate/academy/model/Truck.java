package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int payloadCapacity;
    private String axleConfiguration;
    
    public Truck() {
    }
    
    public int getPayloadCapacity() {
        return payloadCapacity;
    }
    
    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }
    
    public String getAxleConfiguration() {
        return axleConfiguration;
    }
    
    public void setAxleConfiguration(String axleConfiguration) {
        this.axleConfiguration = axleConfiguration;
    }
    
    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
