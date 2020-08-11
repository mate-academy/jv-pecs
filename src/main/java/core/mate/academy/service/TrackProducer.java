package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        List<Track> trackList = new ArrayList<>();
        Track newTrack = new Track("UltraGlide", "MonStar Track", 220, 0);
        trackList.add(newTrack);
        return trackList;
    }
}
