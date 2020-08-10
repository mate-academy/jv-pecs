package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Arrays;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track1 = new Track("fuelTruck", 2000);
        Track track2 = new Track("waterTruck", 3000);
        Track track3 = new Track("milkTruck", 1000);
        return Arrays.asList(track1, track2, track3);
    }
}
