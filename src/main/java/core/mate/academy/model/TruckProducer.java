package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks = new ArrayList<>();
    private Truck first;
    private Truck second;
    private Truck third;

    @Override
    public List<Truck> get() {
        first = new Truck();
        first.setName("ZIL_01");
        first.setName("Blue");
        first.setNumberOfTrailer(1111);
        first.setMaxCapacity(10000);
        second = new Truck();
        second.setName("ZIL_02");
        second.setName("Green");
        second.setNumberOfTrailer(1111);
        second.setMaxCapacity(10000);
        third = new Truck();
        third.setName("ZIL_03");
        third.setName("Gray");
        third.setNumberOfTrailer(1111);
        third.setMaxCapacity(10000);
        trucks.add(first);
        trucks.add(second);
        trucks.add(third);
        return trucks;
    }
}
