package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setColor("Blue");
        truck1.setName("MAN");

        Truck truck2 = new Truck();
        truck2.setColor("White");
        truck2.setName("DAF");

        Truck truck3 = new Truck();
        truck3.setColor("Red");
        truck3.setName("Renault");

        List<Truck> truckList = new ArrayList<>();
        truckList.add(truck1);
        truckList.add(truck2);
        truckList.add(truck3);

        return truckList;
    }
}
