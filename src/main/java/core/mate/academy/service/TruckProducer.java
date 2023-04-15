package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    public static final String FIRST_COLOR = "White";
    public static final String SECOND_COLOR = "Yellow";
    public static final String THIRD_COLOR = "Red";
    public static final String FIRST_NAME = "Man";
    public static final String SECOND_NAME = "Volvo";
    public static final String THIRD_NAME = "Scania";
    private List<Truck> truckList;

    public TruckProducer() {
        truckList = new ArrayList<>();
        truckList.add(produceTruck(FIRST_COLOR, FIRST_NAME));
        truckList.add(produceTruck(SECOND_COLOR, SECOND_NAME));
        truckList.add(produceTruck(THIRD_COLOR, THIRD_NAME));
    }

    private Truck produceTruck(String color, String name) {
        Truck truck = new Truck();
        truck.setColor(color);
        truck.setName(name);
        return truck;
    }

    @Override
    public List get() {
        return truckList;
    }
}
