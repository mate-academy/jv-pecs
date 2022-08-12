package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks = new ArrayList<>();

    public TruckProducer() {
        trucks.add(new Truck("firstTrack", "yellow"));
        trucks.add(new Truck("secondTrack", "pink"));
        trucks.add(new Truck("thirdTrack", "white"));
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
