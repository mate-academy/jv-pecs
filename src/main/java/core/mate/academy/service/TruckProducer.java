package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int COUNT_TRUCK = 3;

    @Override
    public List<Truck> get() {
        List<Truck> listTrack = new ArrayList<>();
        for (int i = 0; i < COUNT_TRUCK; i++) {
            listTrack.add(new Truck());
        }
        return listTrack;
    }
}
