package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track("gas", "Huge"));
        tracks.add(new Track("petrol", "middle"));
        return tracks;
    }
}
