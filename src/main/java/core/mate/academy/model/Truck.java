package core.mate.academy.model;

public class Truck extends Machine {
    private boolean hasBody;

    public Truck(boolean hasBody, String name, String color) {
        super(name, color);
        this.hasBody = hasBody;
    }

    public Truck() {
    }

    public boolean isHasBody() {
        return hasBody;
    }

    public void setHasBody(boolean hasBody) {
        this.hasBody = hasBody;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
