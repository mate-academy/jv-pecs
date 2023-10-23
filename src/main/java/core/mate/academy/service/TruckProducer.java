package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("MAN TGL", "blue", 6700));
        trucks.add(new Truck("MAN TGS", "white", 18000));
        return trucks;
    }
}
