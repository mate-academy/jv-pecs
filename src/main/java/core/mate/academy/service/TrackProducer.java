package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    public static final int TRACK_AMOUNT = 3;

    @Override
    public List<Track> get() {
        List<Track> trackList = new ArrayList<>();
        for (int i = 0; i < TRACK_AMOUNT; i++) {
            trackList.add(new Track("Big " + i, "Mule - " + i));
        }
        return trackList;
    }
}
