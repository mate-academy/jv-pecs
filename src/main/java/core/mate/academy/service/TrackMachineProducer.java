package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackMachineProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track firstTrack = new Track("DAF", "V8");
        Track secondTrack = new Track("SCANIA", "V12");
        List<Track> trackList = new ArrayList<>();
        trackList.add(firstTrack);
        trackList.add(secondTrack);
        return trackList;
    }
}
