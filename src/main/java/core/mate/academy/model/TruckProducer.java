package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final LocalDateTime DATE_TIME = LocalDateTime.now();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(1,"BigTruck","Stark-trucks-corp.", DATE_TIME));
        trucks.add(new Truck(2,"BigTruck","Stark-trucks-corp.", DATE_TIME));
        trucks.add(new Truck(3,"BigTruck","Stark-trucks-corp.", DATE_TIME));
        return trucks;
    }
}
