package core.mate.academy.model;

public class Truck extends Machine {
    private double weight;
    private String bodyType;
    
    public Truck() {
    }
        
    public Truck(double weight, String bodyType) {
        super();
        this.weight = weight;
        this.bodyType = bodyType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
