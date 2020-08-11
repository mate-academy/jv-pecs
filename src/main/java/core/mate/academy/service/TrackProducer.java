package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> trackList = new ArrayList<>();
        trackList.add(new Track(1200, "BD0052"));
        trackList.add(new Track(1500, "BD0053"));
        return trackList;
    }
}
