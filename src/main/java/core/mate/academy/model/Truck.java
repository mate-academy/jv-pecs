package core.mate.academy.model;

public class Truck extends Machine {
    private float payload;

    public Truck() {
    }

    public Truck(String name,String color,float payload) {
        super();
        this.setName(name);
        this.setColor(color);
        this.payload = payload;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public float getPayload() {
        return payload;
    }

    public void setPayload(float payload) {
        this.payload = payload;
    }
}
