package core.mate.academy.producer;

import core.mate.academy.enums.TruckTypes;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> producer() {
        int index = new Random().nextInt(TruckTypes.values().length); 
        
        Truck truckVolvo = new Truck();
        truckVolvo.setTruckType(TruckTypes.values()[index].toString());
        truckVolvo.setColor("Green");
        truckVolvo.setName("Volvo");

        Truck truckScania = new Truck();
        truckScania.setTruckType(TruckTypes.values()[index].toString());
        truckScania.setName("Scania");
        truckScania.setColor("Blue");

        List<Truck> trucks = new ArrayList<>();
        trucks.add(truckVolvo);
        trucks.add(truckScania);

        return trucks;
    }
}
