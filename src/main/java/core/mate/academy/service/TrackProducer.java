package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        List<Track> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Track());
        }
        return list;
    }
}
