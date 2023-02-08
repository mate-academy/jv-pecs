package core.mate.academy.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        List<Truck> truckList = new ArrayList<>();
        truckList.add(truck1);
        truckList.add(truck2);
        truckList.add(truck3);
        return truckList;
    }
}
