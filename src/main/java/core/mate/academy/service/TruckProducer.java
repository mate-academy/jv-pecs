package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Machine> get() {
        Truck first = new Truck(900, 2008);
        first.setName("Mercedes");
        first.setColor("Blue");
        Truck second = new Truck(850, 2009);
        second.setName("Volvo");
        second.setColor("White");
        Truck third = new Truck(1100, 2011);
        third.setName("Daf");
        third.setColor("Yellow");
        return List.of(first, second, third);
    }
}
