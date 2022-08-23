package core.mate.academy.service.impl;

import static core.mate.academy.enums.TruckSize.HEAVY;
import static core.mate.academy.enums.TruckSize.LIGHT;
import static core.mate.academy.enums.TruckSize.MEDIUM;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(LIGHT));
        trucks.add(new Truck(MEDIUM));
        trucks.add(new Truck(HEAVY));
        return trucks;
    }
}
