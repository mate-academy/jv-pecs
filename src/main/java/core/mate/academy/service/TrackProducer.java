package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track1 = new Track();
        Track track2 = new Track();

        List<Track> tracks = new ArrayList<>();
        tracks.add(track1);
        tracks.add(track2);
        return tracks;
    }
}
