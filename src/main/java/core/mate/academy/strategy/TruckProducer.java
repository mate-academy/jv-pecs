package core.mate.academy.strategy;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truck = new Truck();
        truck.setColor("red");
        truck.setName("truck");
        List<Truck> list = new ArrayList<>();
        list.add(truck);
        return list;
    }
}
