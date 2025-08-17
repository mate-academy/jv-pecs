package core.mate.academy.implementations;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucksList = new ArrayList<>();
        trucksList.add(new Truck("truck1", "blu",12, false));
        trucksList.add(new Truck("truck2", "pink",22, false));
        trucksList.add(new Truck("truck3", "beige",30, true));
        return trucksList;
    }
}
