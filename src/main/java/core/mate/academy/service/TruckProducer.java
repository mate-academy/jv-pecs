package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck>{
    Truck truck = new Truck();

    Truck truck1 = new Truck();
    Truck truck2 = new Truck();

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(truck);
        truckList.add(truck1);
        truckList.add(truck2);
        return truckList;
    }
}
