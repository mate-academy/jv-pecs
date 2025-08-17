package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

public interface MachineProducer<Machine> {
    Bulldozer buldozer1 = new Bulldozer(15, "Hyundai", 26);
    Bulldozer buldozer2 = new Bulldozer(10, "JCB", 16);
    Bulldozer buldozer3 = new Bulldozer(12, "Caterpillar", 30);

    Excavator excavator1 = new Excavator(1999, "Holland", 350);
    Excavator excavator2 = new Excavator(2012, "USA", 330);
    Excavator excavator3 = new Excavator(2010, "Polska", 400);

    Truck truck1 = new Truck(2000, 3000, 4);
    Truck truck2 = new Truck(2001, 4200, 6);
    Truck truck3 = new Truck(2002, 2050, 3);

    List<Bulldozer> bulldozers = List.of(buldozer1, buldozer2, buldozer3);
    List<Excavator> excavators = List.of(excavator1, excavator2, excavator3);
    List<Truck> trucks = List.of(truck1, truck2, truck3);

    List<Object> get();
}
