package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    private static final List<Truck> TRUCK_LIST = createTruckList();

    public List<Truck> get() {
        return TRUCK_LIST;
    }

    private static List<Truck> createTruckList() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Truck truck = new Truck();
            truck.setColor("Color" + i);
            truck.setName("name" + i);
            trucks.add(truck);
        }
        return trucks;
    }
}
