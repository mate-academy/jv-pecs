package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            /*
            Truck truck1 = new Truck("owner1", 1);
            Truck truck2 = new Truck("owner1", 2);
            Truck truck3 = new Truck("owner1", 3);
            */
            list.add(new Truck("owner1", i + 1));
        }
        //return List.of(truck1, truck2, truck3);
        return list;
    }
}
