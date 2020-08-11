package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> listOfTracks = new ArrayList<>();
        listOfTracks.add(new Track(12, 140));
        listOfTracks.add(new Track(20, 120));
        return listOfTracks;
    }
}
