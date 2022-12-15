package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<Truck>();
        Truck truck1 = new Truck(1000);
        truck1.setName("Truck 1");
        truck1.setColor("Red");
        trucks.add(truck1);
        Truck truck2 = new Truck(2000);
        truck2.setName("Truck 2");
        truck2.setColor("White");
        trucks.add(truck2);
        return trucks;
    }
}
