package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        fillListOfExcavator();
        return new ArrayList<>(trucks);
    }

    private void fillListOfExcavator() {
        trucks.add(new Truck("Tr1", "yellow",
                35, 10));
        trucks.add(new Truck("Tr2", "Red",
                50, 12));
    }
}
