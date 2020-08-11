package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        List<Track> tracksList = new ArrayList<>();
        Track track1 = new Track(12500,3000);
        Track track2 = new Track(13500,4000);
        tracksList.add(track1);
        tracksList.add(track2);
        return tracksList;
    }
}
