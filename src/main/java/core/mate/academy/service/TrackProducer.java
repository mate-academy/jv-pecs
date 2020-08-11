package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Arrays;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track1 = new Track("Truck1","Black",5, 1000);
        Track track2 = new Track("Truck2","White",4.98, 7500);
        Track track3 = new Track("Truck3","Green",3.5, 9000);
        return Arrays.asList(track1, track2, track3);
    }
}
