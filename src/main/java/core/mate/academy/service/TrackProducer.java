package core.mate.academy.service;

import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

public class TrackProducer implements MachineProducer<Track> {

    @Override
    public List<Track> get() {
        Track volvoTruck = new Track();
        volvoTruck.setName("Volvo");
        Track mercTruck = new Track();
        mercTruck.setName("Mercedes");
        Track renoTruck = new Track();
        renoTruck.setName("Reno");

        List<Track> truckList = new ArrayList<>();
        truckList.add(volvoTruck);
        truckList.add(mercTruck);
        truckList.add(renoTruck);

        return truckList;
    }
}
