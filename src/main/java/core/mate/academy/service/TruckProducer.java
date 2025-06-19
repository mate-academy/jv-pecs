package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    
    @Override
    public List<Truck> get() {
        final List<Truck> trucks = new ArrayList<>();
        
        Truck truck1 = new Truck();
        truck1.setLoadCapacity(15.0);
        truck1.setAxleCount(1);
        truck1.setHasTrailer(true);
        truck1.setCargoType("bulk");
        trucks.add(truck1);
        
        Truck truck2 = new Truck();
        truck2.setLoadCapacity(16.0);
        truck2.setAxleCount(1);
        truck2.setHasTrailer(true);
        truck2.setCargoType("bulks");
        trucks.add(truck2);
        
        Truck truck3 = new Truck();
        truck3.setLoadCapacity(17.0);
        truck3.setAxleCount(1);
        truck3.setHasTrailer(true);
        truck3.setCargoType("bulked");
        trucks.add(truck3);
        
        return trucks;
    }
}
