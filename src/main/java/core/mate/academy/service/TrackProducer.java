package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track(1992, "diesel"));
        tracks.add(new Track(2000, "gasoline"));
        tracks.add(new Track(2020, "biodiesel"));
        return tracks;
    }
}
