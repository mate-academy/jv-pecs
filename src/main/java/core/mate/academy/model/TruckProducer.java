package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(1,"BigTruck","Stark-corp.", LocalDateTime.now()));
        trucks.add(new Truck(2,"BigTruck","Stark-corp.", LocalDateTime.now()));
        trucks.add(new Truck(3,"BigTruck","Stark-corp.", LocalDateTime.now()));
        return trucks;
    }
}
