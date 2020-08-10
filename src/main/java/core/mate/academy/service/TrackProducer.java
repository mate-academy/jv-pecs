package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> listOfTracks = new ArrayList<>();
        listOfTracks.add(new Track());
        listOfTracks.add(new Track());
        return listOfTracks;
    }
}



