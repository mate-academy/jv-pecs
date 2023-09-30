package core.mate.academy.model;

public class Truck extends Machine {
    private String typeTruck;
    private Integer priceTruck;

    public Truck(String typeTruck, Integer priceTruck) {
        this.typeTruck = typeTruck;
        this.priceTruck = priceTruck;
    }

    public Truck() {
    }

    public String getTypeTruck() {
        return typeTruck;
    }

    public void setTypeTruck(String typeTruck) {
        this.typeTruck = typeTruck;
    }

    public Integer getPriceTruck() {
        return priceTruck;
    }

    public void setPriceTruck(Integer priceTruck) {
        this.priceTruck = priceTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
