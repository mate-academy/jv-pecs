package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck("onboard", 8000, 2);
    private Truck truck2 = new Truck("van", 20000, 4);
    private Truck truck3 = new Truck("refrifirator", 15000, 3);

    @Override
    public List<Truck> get() {
        List<Truck> trucks = Arrays.asList(truck1, truck2, truck3);
        return trucks;
    }
}
