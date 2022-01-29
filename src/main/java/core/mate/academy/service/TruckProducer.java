package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck("GTR1","red",120,"Sam");
        Truck truck2 = new Truck("GMW","blue",200,"Andrew");
        Truck truck3 = new Truck("RX","black",175,"Ann");
        return List.of(truck1,truck2,truck3);
    }
}
