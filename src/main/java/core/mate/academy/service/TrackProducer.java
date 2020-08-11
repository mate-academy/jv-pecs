package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track(340, 150));
        tracks.add(new Track(230, 100));
        tracks.add(new Track(255, 120));
        return tracks;
    }
}
