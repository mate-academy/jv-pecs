package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {

    private int trailerVolume;

    public Track() {
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }

    @Override
    public List<Track> get() {
        List<Track> list = new ArrayList<>();
        list.add(new Track());
        return list;
    }
}
