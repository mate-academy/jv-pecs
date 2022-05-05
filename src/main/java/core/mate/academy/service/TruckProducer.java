package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck truck1 = new Truck();
        truck1.setNumberOfWheels(6);
        Truck truck2 = new Truck();
        truck2.setNumberOfWheels(8);
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}
