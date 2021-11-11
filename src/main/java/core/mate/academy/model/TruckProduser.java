package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProduser implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setName("truck1");
        truck1.setColor("blue");
        truck1.setLoadCapacity(25);

        Truck truck2 = new Truck();
        truck2.setName("truck2");
        truck2.setColor("green");
        truck2.setLoadCapacity(20);

        Truck truck3 = new Truck();
        truck3.setName("truck3");
        truck3.setColor("gray");
        truck3.setLoadCapacity(22);

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
