package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck htz150 = new Truck("ХТЗ-150К-09.172.00", 4500);
    private final Truck htz242 = new Truck("ХТЗ-242К.20", 5000);
    private final Truck htz249 = new Truck("ХТЗ-249К.20", 5500);
    private final List<Truck> trucks = List.of(htz150, htz242, htz249);

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
