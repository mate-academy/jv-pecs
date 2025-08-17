package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck lorry = new Truck("Lorry", 10);
    private Truck tipper = new Truck("Tipper", 40.5);
    private List<Truck> trucks = new ArrayList<>();

    @Override
    public List get() {
        trucks.add(lorry);
        trucks.add(tipper);
        return trucks;
    }
}
