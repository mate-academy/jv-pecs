package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Collections;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track = new Track();
        return Collections.singletonList(track);
    }
}
