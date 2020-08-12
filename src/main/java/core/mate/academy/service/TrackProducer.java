package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track());
        tracks.add(new Track(20, "Auto", "Track", "Blue"));
        tracks.add(new Track(50, "Auto", "SpeedTrack", "White"));
        return tracks;
    }

}
