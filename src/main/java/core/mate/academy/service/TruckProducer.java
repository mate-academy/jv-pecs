package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Liebherr", "yellow", "ERT23", 56));
        trucks.add(new Truck("Caterpillar", "purple", "TRY89", 62));
        trucks.add(new Truck("Volvo", "orange", "TIO78", 71));
        return trucks;
    }
}
