package core.mate.academy.service;

import core.mate.academy.model.Truck;
import core.mate.academy.model.enums.Color;
import core.mate.academy.model.enums.TruckType;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck("Betty", Color.WHITE.name(),
                TruckType.LIGHT));
        list.add(new Truck("Bandito", Color.GREY.name(),
                TruckType.TRANSPORTERS));
        list.add(new Truck("Black Beauty", Color.BLACK.name(),
                TruckType.HEAVY));
        return list;
    }
}
