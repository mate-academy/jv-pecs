package core.mate.academy.producer;

import core.mate.academy.model.Track;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track1 = new Track(11);
        Track track2 = new Track(22);
        Track track3 = new Track(33);
        List<Track> tracks = List.of(track1,track2,track3);
        return tracks;
    }
}
