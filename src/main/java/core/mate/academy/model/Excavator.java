package core.mate.academy.model;

public class Excavator extends Machine {
    private String brand;
    private int horsePower;
    private boolean isWorking;

    public Excavator() {
    }

    public Excavator(String brand, int horsePower) {
        this.brand = brand;
        this.horsePower = horsePower;
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
