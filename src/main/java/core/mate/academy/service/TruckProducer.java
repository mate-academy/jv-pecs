package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck>{
    Truck truck = new Truck();
    Truck truck1 = new Truck();
    Truck truck2 = new Truck();
    Excavator excavator3 = new Excavator();
    Machine machine = new Truck();
    //Truck truck4 = new Machine();
    String string = "qwrt";
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(truck);
        truckList.add(truck1);
        truckList.add(truck2);
        //truckList.add(excavator3);
        //truckList.add(machine);
        //truckList.add(string);
        return truckList;
    }
}
