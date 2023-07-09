package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Machine> get() {
        final Machine truck1 = new Truck("Flatbed",280);
        final Machine truck2 = new Truck("Tank",400);
        final Machine truck3 = new Truck("Trailer",600);
        truck1.setColor("Green");
        truck1.setName("IVECO");
        truck2.setColor("White");
        truck2.setName("MERCEDES");
        truck3.setColor("Orange");
        return List.of(truck1,truck2,truck3);
    }
}
