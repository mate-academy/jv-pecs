package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("2,8 m", "1,8 m", "9 m^3"));
        trucks.add(new Truck("3,7 m", "2,1 m", "17 m^3"));
        return trucks;
    }
}
