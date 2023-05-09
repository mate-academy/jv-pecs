package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck truck770G;
    private final Truck truck773G;
    private final Truck truck772G;

    public TruckProducer() {
        truck770G = new Truck(49,34, 101464);
        truck770G.setName("Cat 770G");
        truck770G.setColor("Yellow");
        truck773G = new Truck(53, 35, 102739);
        truck773G.setName("Cat 773G");
        truck773G.setColor("Yellow");
        truck772G = new Truck(51.4, 34.2, 102110);
        truck772G.setName("Cat 772G");
        truck772G.setColor("Yellow");
    }

    @Override
    public List<Truck> get() {
        return List.of(truck770G, truck772G, truck773G);
    }
}
