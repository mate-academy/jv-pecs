package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Volvo", "white",
                true, 42.0, 4));
        trucks.add(new Truck("MAN", "blue",
                false, 28.5, 3));
        return trucks;
    }
}
