package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        final Truck man = new Truck("man", "black");
        final Truck mercedes = new Truck("mercedes", "white");
        final Truck maz = new Truck("maz", "green");
        List<Truck> trucks = new ArrayList<>();
        trucks.add(man);
        trucks.add(mercedes);
        trucks.add(maz);
        return trucks;
    }
}
