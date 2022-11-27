package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final String TRUCK_NAME_1 = "Chornonog";
    private static final String TRUCK_NAME_2 = "Kombinate";
    private static final String TRUCK_COLOR_1 = "Pink";
    private static final String TRUCK_COLOR_2 = "White";
    private static final int TRUCK_MAX_SPEED_1 = 80;
    private static final int TRUCK_MAX_SPEED_2 = 74;
    private static final int TRUCK_WEIGHT_1 = 115;
    private static final int TRUCK_WEIGHT_2 = 140;

    public List<Truck> get() {
        Truck truck1 = new Truck(TRUCK_NAME_1, TRUCK_COLOR_1, TRUCK_MAX_SPEED_1, TRUCK_WEIGHT_1);
        Truck truck2 = new Truck(TRUCK_NAME_2, TRUCK_COLOR_2, TRUCK_MAX_SPEED_2, TRUCK_WEIGHT_2);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}
