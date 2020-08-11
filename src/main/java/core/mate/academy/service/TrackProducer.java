package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.Arrays;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track truckOne = new Track("Tesla Semi", "electric", 36000);
        Track truckSecond = new Track("Volvo FH", "benzine", 45000);
        Track truckThird = new Track("Scania R730", "benzine", 40000);
        return Arrays.asList(truckOne, truckSecond, truckThird);
    }
}
