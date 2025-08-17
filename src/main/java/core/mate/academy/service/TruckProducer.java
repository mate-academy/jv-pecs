package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Volvo FH", "білий", 20000));
        trucks.add(new Truck("Scania R450", "червоний", 25000));
        return trucks;
    }
}
