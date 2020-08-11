package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        List<Track> trackList = new ArrayList<Track>();
        trackList.add(new Track(4,100.5f,"Maz","blue"));
        trackList.add(new Track(6,400.2f,"Cat","white"));
        trackList.add(new Track(8,500.5f,"Gaz","black"));
        return trackList;
    }
}
