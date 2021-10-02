package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck chevrolet = new Truck("Chevrolet", "green", 100);
    private Truck daimler = new Truck("Daimler", "blue", 120);
    private Truck isuzu = new Truck("Isuzu", "black", 140);

    @Override
    public List<Truck> get() {
        return List.of(chevrolet, daimler, isuzu);
    }
}
