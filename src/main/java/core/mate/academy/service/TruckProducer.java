package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Ford F-750", 2016, 40));
        trucks.add(new Truck("MAN TGS 18.500", 2020, 46));
        trucks.add(new Truck("Mercedes-Benz Arocs", 2022, 28));
        return trucks;
    }
}
