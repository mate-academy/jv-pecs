package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrackMachineProducer implements MachineProducer<Track> {
    private static final int NUMBER_OF_MACHINES = 3;
    private static final int RANGE_OF_RANDOM_VALUE = 1000;

    @Override
    public List<Track> get() {
        List<Track> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_MACHINES; i++) {
            list.add(new Track("Model " + (new Random().nextInt(RANGE_OF_RANDOM_VALUE)), i));
        }
        return list;
    }
}
