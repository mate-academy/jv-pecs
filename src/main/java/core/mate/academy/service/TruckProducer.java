package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck scania = new Truck();
        Truck daf = new Truck();
        scania.setName("Scania");
        daf.setName("Daf");
        scania.setColor("Red");
        daf.setColor("Blue");
        return new ArrayList<>(List.of(scania, daf));
    }
}
