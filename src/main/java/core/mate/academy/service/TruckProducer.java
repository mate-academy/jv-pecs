package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucList = new ArrayList<>();
        Truck truck1 = new Truck(40);
        truck1.setName("Excavator#1");
        truck1.setColor("white");
        trucList.add(truck1);
        Truck truck2 = new Truck(50);
        truck2.setName("Excavator#2");
        truck2.setColor("green");
        trucList.add(truck2);
        Truck truck3 = new Truck(70);
        truck3.setName("Excavator#2");
        truck3.setColor("yellow");
        trucList.add(truck3);
        return trucList;
    }
}
