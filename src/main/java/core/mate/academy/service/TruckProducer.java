package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck truckChris = new Truck();
        truckChris.setColor("Green");
        truckChris.setName("Chris");
        truckChris.setModel("Cool");
        Truck truckBig = new Truck();
        truckBig.setColor("Yellow");
        truckBig.setName("Big");
        truckBig.setModel("NotCool");
        Truck truckOrest = new Truck();
        truckOrest.setColor("Orange");
        truckOrest.setName("Orest");
        truckOrest.setModel("Coolest");

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truckChris);
        trucks.add(truckBig);
        trucks.add(truckOrest);
        return trucks;
    }
}
