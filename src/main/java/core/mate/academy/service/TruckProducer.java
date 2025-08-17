package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer {
    private Truck truck1 = new Truck("cab over", "refuse truck");
    private Truck truck2 = new Truck("cub under", "box truck");
    private Truck truck3 = new Truck("conventional", "tank truck");
    private List<Truck> list = List.of(truck1, truck2, truck3);

    @Override
    public List<Truck> get() {
        return list;
    }
}
