package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    static List<Bulldozer> getBulldozers() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer());
        return bulldozers;
    }

    static List<Excavator> getExcavators() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator());
        excavators.add(new Excavator());
        return excavators;
    }

    static List<Truck> getTrucks() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck());
        trucks.add(new Truck());
        return trucks;
    }
}
