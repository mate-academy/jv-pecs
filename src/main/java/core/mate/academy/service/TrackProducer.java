package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Arrays;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track trackOne = new Track("merMercedes", 3000);
        Track trackTwo = new Track("nissan", 5000);
        return Arrays.asList(trackOne, trackTwo);
    }
}
