package core.mate.academy.model;

import java.util.Date;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String model;
    private Date year;
    private double price;

    public Bulldozer() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public Date getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
