package core.mate.academy.service.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck>{
    @Override
    public List<Truck> get() {
        List<Truck> trucks= new ArrayList<>();
        trucks.add(new Truck("V6 diesel", 120, false));
        trucks.add(new Truck("V8 diesel", 150, true));
        return trucks;
    }
}
