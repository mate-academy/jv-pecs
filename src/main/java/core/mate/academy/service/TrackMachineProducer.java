package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackMachineProducer implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track(100, "nissan"));
        tracks.add(new Track(200, "toyota"));
        tracks.add(new Track(300, "mercedes-benz"));
        return tracks;
    }
}
