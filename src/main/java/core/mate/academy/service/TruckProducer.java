package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setName("Caterpillar");
        truck1.setColor("Yellow");
        truck1.setDumpBedVolume(5.5);
        List<Truck> list = new ArrayList<>();
        list.add(truck1);
        Truck truck2 = new Truck();
        truck2.setName("Caterpillar");
        truck2.setColor("Yellow");
        truck2.setDumpBedVolume(6.0);
        list.add(truck2);
        return list;
    }
}
