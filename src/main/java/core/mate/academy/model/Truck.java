package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private String modelTruck;
    private String bodyType;
    private String sizeType;

    public Truck() {

    }

    public Truck(String modelTruck, String bodyType, String sizeType) {
        this.modelTruck = modelTruck;
        this.bodyType = bodyType;
        this.sizeType = sizeType;
    }

    public void setModelTruck(String modelTruck) {
        this.modelTruck = modelTruck;
    }

    public String getModelTruck() {
        return modelTruck;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    public String getSizeType() {
        return sizeType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
