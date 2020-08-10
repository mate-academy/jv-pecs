package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track("volvo", 2020));
        tracks.add(new Track("man", 1992));
        tracks.add(new Track("scania", 2010));
        return tracks;
    }
}
