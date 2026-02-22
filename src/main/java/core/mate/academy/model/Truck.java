package core.mate.academy.model;

import java.math.BigDecimal;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private BigDecimal costOfTheTruck;

    public Truck() {
        costOfTheTruck = new BigDecimal(12);
    }

    public BigDecimal getCostOfTheTruck() {
        return costOfTheTruck;
    }

    public void setCostOfTheTruck(BigDecimal costOfTheTruck) {
        this.costOfTheTruck = costOfTheTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
