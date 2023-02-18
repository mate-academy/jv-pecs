package core.mate.academy.producer;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer {
    @Override
    public List<? extends Machine> get() {
        List<Truck> machines = new ArrayList();
        machines.add(new Truck("SkyTrack", "blue", 200, 2));
        machines.add(new Truck("GreenpeaceTruck", "green", 150, 1));
        return machines;
    }
}
