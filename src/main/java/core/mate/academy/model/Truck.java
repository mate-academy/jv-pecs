package core.mate.academy.model;

import java.time.LocalDateTime;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int id;
    private String model;
    private String brand;
    private LocalDateTime dateCreated;

    public Truck() {
    }

    public Truck(int id, String model, String brand, LocalDateTime dateCreated) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
