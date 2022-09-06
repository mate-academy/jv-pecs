package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Volvo", 10_500));
        truckList.add(new Truck("DAF", 20_000));
        truckList.add(new Truck("SCANIA", 30_000));
        return truckList;
    }
}
