package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setName("T1");
        truck1.setColor("TR1");
        Truck truck2 = new Truck();
        truck2.setName("T2");
        truck2.setColor("TG2");
        List<Truck> truckList = List.of(truck1,truck2);
        return truckList;
    }
}
