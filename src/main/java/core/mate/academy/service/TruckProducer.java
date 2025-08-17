package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Volvo", "orange", 25));
        trucks.add(new Truck("Mersedes","silver", 27));
        trucks.add(new Truck("Daf", "white",30));
        return trucks;
    }
}
