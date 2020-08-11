package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Arrays;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        Track firstTrack = new Track("Hunter", 18);
        Track secondTrack = new Track();
        return Arrays.asList(firstTrack, secondTrack);
    }
}
