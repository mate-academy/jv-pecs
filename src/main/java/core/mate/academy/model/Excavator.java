package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String model;
    private int price;

    public Excavator() {
    }

    public Excavator(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
