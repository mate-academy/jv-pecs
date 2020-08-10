package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> trucks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            trucks.add(new Track(3000 + i,300 + i * 10));
        }
        return trucks;
    }
}
