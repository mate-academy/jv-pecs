package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {
    @Override
    public List<Track> get() {
        Track track = new Track(650, "Sweden");
        track.setColor("grey");
        track.setName("Volvo");
        Track track1 = new Track(700, "USA");
        track1.setName("Ford");
        track1.setColor("red");
        return List.of(track,track1);
    }
}
