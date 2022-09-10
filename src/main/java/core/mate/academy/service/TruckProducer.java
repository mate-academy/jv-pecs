package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Chevrolet", 120));
        trucks.add(new Truck("Daimler", 220));
        trucks.add(new Truck("Fiat", 320));
        trucks.add(new Truck("Ford", 420));
        trucks.add(new Truck("GMC", 520));
        return trucks;
    }
}
