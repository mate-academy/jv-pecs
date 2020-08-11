package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> tracks = new ArrayList<>();
        for (int i = 0, n = 3; i < n; i++) {
            tracks.add(new Track("Track" + i, "Green",
                    (int) (Math.random() * 10) + 1, (int) (Math.random() * 10 + 1), true));
        }
        return tracks;
    }
}
