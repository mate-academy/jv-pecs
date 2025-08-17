package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck currier = new Truck(2000, "Dry Van Trailer");
    private Truck delivery = new Truck(3500, "Standard Flatbed Trailers");
    private Truck heavyDuty = new Truck(7000, "Drop-Deck Trailer");

    @Override
    public List<Truck> get() {
        return Arrays.asList(currier, delivery, heavyDuty);
    }
}
