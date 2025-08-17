package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truckVolvo = new Truck();
        truckVolvo.setName("Volvo");
        truckVolvo.setColor("Red");
        truckVolvo.setLoadCapacity(40.5);
        truckVolvo.setDriveAxleRatio(4.1);

        Truck truckMercedes = new Truck();
        truckMercedes.setName("Mercedes");
        truckMercedes.setColor("Yellow");
        truckMercedes.setLoadCapacity(41.0);
        truckMercedes.setDriveAxleRatio(3.8);

        Truck truckMan = new Truck();
        truckMan.setName("Man");
        truckMan.setColor("Orange");
        truckMan.setLoadCapacity(45.1);
        truckMan.setDriveAxleRatio(4.25);

        List<Truck> truckList = new ArrayList<>();
        truckList.add(truckVolvo);
        truckList.add(truckMercedes);
        truckList.add(truckMan);

        return truckList;
    }
}
