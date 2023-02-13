package core.mate.academy.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck sunkenTruck = new Truck();
        Truck newTruck = new Truck();
        List<Truck> truckList = new ArrayList<>();
        truckList.add(sunkenTruck);
        truckList.add(newTruck);
        return truckList;
    }
}
