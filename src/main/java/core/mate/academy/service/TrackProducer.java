package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> track = new ArrayList<>();
        track.add(new Track(1000, 50));
        track.add(new Track(1450, 40));
        track.add(new Track(1300, 65));
        return track;
    }
}
