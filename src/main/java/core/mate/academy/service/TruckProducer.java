package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final String TRUCK_NAME_1 = "DAF";
    private static final String TRUCK_NAME_2 = "Foton";
    private static final String TRUCK_COLOR_1 = "Blue";
    private static final String TRUCK_COLOR_2 = "White";
    private static final int TRUCK_MAX_SPEED_1 = 85;
    private static final int TRUCK_MAX_SPEED_2 = 90;
    private static final int TRUCK_CARGO_CAPACITY_1 = 30;
    private static final int TRUCK_CARGO_CAPACITY_2 = 18;
    private static final int TRUCK_HEIGHT_1 = 3500;
    private static final int TRUCK_HEIGHT_2 = 3800;

    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck(TRUCK_NAME_1, TRUCK_COLOR_1,
                TRUCK_MAX_SPEED_1, TRUCK_CARGO_CAPACITY_1, TRUCK_HEIGHT_1);
        Truck truck2 = new Truck(TRUCK_NAME_2, TRUCK_COLOR_2,
                TRUCK_MAX_SPEED_2, TRUCK_CARGO_CAPACITY_2, TRUCK_HEIGHT_2);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}
