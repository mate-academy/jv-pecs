package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        final List<Machine> trucks = new ArrayList<>();

        Truck truck1 = new Truck();
        truck1.setName("Truck T1");
        truck1.setColor("White");
        truck1.setLoadCapacity(10.0);
        truck1.setNumberOfAxles(4);
        trucks.add(truck1);

        Truck truck2 = new Truck();
        truck2.setName("Truck T2");
        truck2.setColor("Black");
        truck2.setLoadCapacity(12.5);
        truck2.setNumberOfAxles(6);
        trucks.add(truck2);

        return trucks;
    }
}
