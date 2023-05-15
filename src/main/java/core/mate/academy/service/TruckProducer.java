package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        final List<Truck> truckList = new ArrayList<>();
        Truck truck = new Truck();
        truck.setName("first");
        truck.setColor("White");
        truck.setMaxSpeed(70);
        truck.setFuelVolume(300);

        Truck truck2 = new Truck();
        truck2.setName("second");
        truck2.setColor("Blsck");
        truck2.setMaxSpeed(80);
        truck2.setFuelVolume(400);

        Truck truck3 = new Truck();
        truck3.setName("third");
        truck3.setColor("Blue");
        truck3.setMaxSpeed(80);
        truck3.setFuelVolume(400);

        truckList.add(truck);
        truckList.add(truck2);
        truckList.add(truck3);

        return truckList;
    }
}
