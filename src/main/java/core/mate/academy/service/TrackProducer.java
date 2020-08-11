package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        Track track1 = new Track();
        track1.setPower(6000);
        track1.setProducer("Germany");
        Track track2 = new Track();
        track2.setPower(6700);
        track2.setProducer("Soviet Union");
        Track track3 = new Track();
        track3.setPower(5200);
        track3.setProducer("Japan");
        List<Track> newTracks = new ArrayList<>();
        newTracks.add(track1);
        newTracks.add(track2);
        newTracks.add(track3);
        return newTracks;
    }
}
