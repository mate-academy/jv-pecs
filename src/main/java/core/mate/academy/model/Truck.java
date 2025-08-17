package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String bodyTypes;
    private String typesBySize;

    public Truck(String bodyTypes, String typesBySize) {
        this.bodyTypes = bodyTypes;
        this.typesBySize = typesBySize;
    }

    public Truck() {
    }

    public String getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(String bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    public String getTypesBySize() {
        return typesBySize;
    }

    public void setTypesBySize(String typesBySize) {
        this.typesBySize = typesBySize;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
