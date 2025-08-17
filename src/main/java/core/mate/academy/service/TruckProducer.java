package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("red", 77, 3500));
        trucks.add(new Truck("blue", 98, 3750));
        trucks.add(new Truck("purple", 78, 4000));
        return trucks;
    }

}
