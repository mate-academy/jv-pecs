package core.mate.academy.service.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList();
        truckList.add(new Truck("Truck1", "yello", 120));
        truckList.add(new Truck("Truck2", "green", 121));
        truckList.add(new Truck("Truck3", "y", 12));
        truckList.add(new Truck("Truck4", "g", 11));
        return truckList;
    }
}
