package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Arrays;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track = new Track();
        Track track1 = new Track();
        return Arrays.asList(track, track1);
    }
}
