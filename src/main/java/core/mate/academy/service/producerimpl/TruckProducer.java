package core.mate.academy.service.producerimpl;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    private Truck truck1 = new Truck();
    private Truck truck2 = new Truck();
    private Truck truck3 = new Truck();
    private List<Machine> trucks = new ArrayList<>();

    @Override
    public List<Machine> get() {
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }
}
