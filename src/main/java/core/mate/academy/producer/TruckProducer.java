package core.mate.academy.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.producer.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck(18.2, 4.5, 7));
        truckList.add(new Truck(16.6, 4.2, 4));
        truckList.add(new Truck(18, 5.5, 10));
        return truckList;
    }
}
