package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Tata", "Box truck"));
        trucks.add(new Truck("Iveco", "Tank track"));
        trucks.add(new Truck("Dongfeng", "Dump_truck"));
        return trucks;
    }
}
