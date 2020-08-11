package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.LinkedList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> list = new LinkedList<>();
        list.add(new Track());
        list.add(new Track());
        list.add(new Track());
        return list;
    }
}
