package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackMachineProducerImpl implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        Track trackOne = new Track(3000, 35000);
        Track trackTwo = new Track(2500, 28000);
        List<Track> trackList = new ArrayList<>(2);

        trackList.add(trackOne);
        trackList.add(trackTwo);
        return trackList;
    }
}
