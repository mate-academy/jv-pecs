package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private  String bodyType;

    public Truck() {
    }

    public Truck(String name, String color, String bodyType) {
        this.setName(name);
        this.setColor(color);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
