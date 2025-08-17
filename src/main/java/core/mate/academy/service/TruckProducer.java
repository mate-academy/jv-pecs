package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck770G = new Truck("Cat 770G", "Yellow", 49,34, 101464);
        Truck truck773G = new Truck("Cat 773G", "Yellow", 53, 35, 102739);
        Truck truck772G = new Truck("Cat 772G", "Yellow", 51.4, 34.2, 102110);
        return List.of(truck770G, truck772G, truck773G);
    }
}
