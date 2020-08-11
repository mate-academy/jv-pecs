package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackFactory implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        List<Track> list = new ArrayList<>();
        list.add(new Track(1000, 10, "blue"));
        list.add(new Track(1800, 6, "red"));
        list.add(new Track(55000, 8, "yellow"));
        return list;
    }
}
