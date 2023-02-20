package core.mate.academy.producer;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList();
        trucks.add(new Truck("SkyTrack", "blue", 200, 2));
        trucks.add(new Truck("GreenpeaceTruck", "green", 150, 1));
        return trucks;
    }
}
