package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        final Truck truckVolvo = new Truck();
        truckVolvo.setColor("Red");
        truckVolvo.setName("Volvo");
        truckVolvo.setLoadCapacity(18.0);
        final Truck truckMan = new Truck();
        truckMan.setColor("Blue");
        truckMan.setName("MAN");
        truckMan.setLoadCapacity(20.5);
        List<Truck> result = new ArrayList<>();
        result.add(truckVolvo);
        result.add(truckMan);
        return result;
    }
}
