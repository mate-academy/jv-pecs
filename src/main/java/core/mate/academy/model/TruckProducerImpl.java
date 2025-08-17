package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        truck1.setName("Truck 1");
        truck1.setColor("Red");
        truck1.setTypeTrailer("Trailer 1");
        Truck truck2 = new Truck();
        truck2.setName("Truck 2");
        truck2.setColor("Green");
        truck2.setTypeTrailer("Trailer 2");
        List<Truck> truckList = List.of(truck1,truck2);
        return truckList;
    }
}
