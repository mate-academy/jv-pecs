package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Track> {
    private static final int TRUCK_QUANTITY = 3;

    @Override
    public List<Track> get() {
        List<Track> trucks = new ArrayList<>();
        for (int i = 0; i < TRUCK_QUANTITY; i++) {
            trucks.add(new Track(3000 + i,300 + i * 10));
        }
        return trucks;
    }
}
