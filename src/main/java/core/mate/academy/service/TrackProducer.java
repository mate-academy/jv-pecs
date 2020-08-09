package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Arrays;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track trackOne = new Track(20, 130);
        Track trackTwo = new Track(30, 110);
        return Arrays.asList(trackOne, trackTwo);
    }
}
