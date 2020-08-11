package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Arrays;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track8 = new Track(250, 6.5);
        Track track16 = new Track(300, 4.5);
        Track track32 = new Track(500, 2.9);
        return Arrays.asList(track8, track16, track32);
    }
}
