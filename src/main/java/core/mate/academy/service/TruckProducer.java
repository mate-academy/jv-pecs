package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new LinkedList<>();
        trucks.add(new Truck("AmmoDeliver", "gray", "Kraz"));
        trucks.add(new Truck("Samosval", "green", "Zil"));
        trucks.add(new Truck("Chumak", "blue", "Kamaz"));
        return trucks;
    }
}
