package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truck = new ArrayList<>();
        truck.add(new Truck("MAN", "White", 18));
        truck.add(new Truck("Fiat", "Blue", 16));
        truck.add(new Truck("Volvo", "White", 20));
        return truck;
    }
}
