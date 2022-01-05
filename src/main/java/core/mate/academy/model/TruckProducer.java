package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    static final Truck man = new Truck("man", "black");
    static final Truck mercedes = new Truck("mercedes", "white");
    static final Truck maz = new Truck("maz", "green");

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(man);
        trucks.add(mercedes);
        trucks.add(maz);
        return trucks;
    }
}
