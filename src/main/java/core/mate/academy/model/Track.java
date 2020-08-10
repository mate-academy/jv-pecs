package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    public Track() {
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }

    @Override
    public List<? extends Machine> get() {
        Track track1 = new Track();
        Track track2 = new Track();

        List<Track> tracks = new ArrayList<>();
        tracks.add(track1);
        tracks.add(track2);
        return tracks;
    }
}
