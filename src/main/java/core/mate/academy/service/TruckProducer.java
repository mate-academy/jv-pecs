package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();

        truck1.setName("Truck 1");
        truck1.setColor("Caramel");
        truck1.setBodyType("Body 1");
        truck1.setEngineType("Engine 1");
        truck1.setLiftCapacity(100);

        truck2.setName("Truck 2");
        truck2.setColor("Brown");
        truck2.setBodyType("Body 2");
        truck2.setEngineType("Engine 2");
        truck2.setLiftCapacity(200);

        truck3.setName("Truck 3");
        truck3.setColor("Green");
        truck3.setBodyType("Body 3");
        truck1.setEngineType("Engine 3");
        truck1.setLiftCapacity(300);

        List<Truck> truckList = new ArrayList<>();

        truckList.add(truck1);
        truckList.add(truck2);
        truckList.add(truck3);

        return  truckList;
    }
}
