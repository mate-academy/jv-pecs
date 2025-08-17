package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks;

    public TruckProducer() {
        trucks = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        trucks.add(Truck.of(7,10,"General cargo"));
        trucks.add(Truck.of(20,20,"Fuel cargo"));
        trucks.add(Truck.of(15,12,"Container cargo"));
        return trucks;
    }
}
