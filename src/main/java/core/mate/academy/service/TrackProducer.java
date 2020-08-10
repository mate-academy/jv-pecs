package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Arrays;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track1 = new Track(5, 1000);
        Track track2 = new Track(4.98, 7500);
        Track track3 = new Track(3.5, 9000);
        return Arrays.asList(track1, track2, track3);
    }
}
