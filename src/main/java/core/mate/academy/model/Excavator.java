package core.mate.academy.model;

import java.time.LocalDateTime;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int id;
    private String model;
    private String brand;
    private LocalDateTime dateCreated;

    public Excavator() {
    }

    public Excavator(int id, String model, String brand, LocalDateTime dateCreated) {
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
        System.out.println("Excavator started to work");
    }
}
