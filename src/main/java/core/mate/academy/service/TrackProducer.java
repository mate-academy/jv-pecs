package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer<T extends Machine> implements MachineProducer {
    @Override
    public List<Track> get() {
        List<Track> listOfTracks = new ArrayList<>();
        listOfTracks.add(new Track(12, 140));
        listOfTracks.add(new Track(20, 120));
        return listOfTracks;
    }
}
