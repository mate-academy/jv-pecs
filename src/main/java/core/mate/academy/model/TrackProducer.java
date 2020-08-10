package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track1 = new Track(8, 110);
        Track track2 = new Track(10, 110);
        Track track3 = new Track(13, 100);
        List<Track> trackList = new ArrayList<>();
        trackList.add(track1);
        trackList.add(track2);
        trackList.add(track3);
        return trackList;
    }
}
