package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<? extends Machine> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Scania", 5500, 2010));
        truckList.add(new Truck("Renault", 5200, 2014));
        truckList.add(new Truck("DAF", 5350, 2017));
        return truckList;
    }
}
