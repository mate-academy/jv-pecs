package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();

        Truck truck1 = new Truck(7500, 300, "Petroleum");
        truck1.setName("Volvo");
        truck1.setColor("Black");
        truckList.add(truck1);

        Truck truck2 = new Truck(10000, 500, "Diesel");
        truck2.setName("Man");
        truck2.setColor("Blue");
        truckList.add(truck2);

        Truck truck3 = new Truck(20000, 600, "Diesel");
        truck3.setName("GM");
        truck3.setColor("Silver");
        truckList.add(truck3);

        return truckList;
    }
}
