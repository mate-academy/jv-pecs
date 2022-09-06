package core.mate.academy.model;

public class Excavator extends Machine {
    private String brand;
    private int engineCapacity;
    private boolean isWorking;

    public Excavator() {
    }

    public Excavator(String brand, int engineCapacity) {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void doWork() {
        isWorking = true;
        if (brand != null) {
            System.out.println("Excavator " + brand + " started to work");
        } else {
            System.out.println("Excavator started to work");
        }
    }
}
