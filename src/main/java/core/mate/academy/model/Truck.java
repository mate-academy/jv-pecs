package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements MachineProducer<Truck> {
    private String typeOfTruck;
    private int length;

    public Truck() {
    }

    public Truck(String name, String color,String typeOfTruck, int length) {
        super(name, color);
        this.typeOfTruck = typeOfTruck;
        this.length = length;
    }

    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public List<Truck> get() {
        Truck bredly = new Truck("BMP", "Yellow", "Сaterpillar", 6450);
        Truck marder = new Truck("BTR", "Green", "Wheeled", 6790);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(bredly);
        trucks.add(marder);
        return trucks;
    }
}
