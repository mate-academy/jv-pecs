package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {

    /**
     * In your implementations - create 2-3 models, add them to the list and return
     *
     * @return - the list of models
     */
    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        truckList.add(new Truck("Reno", "Black", 900));
        truckList.add(new Truck("Scania", "Gold", 1000));
        truckList.add(new Truck("Daf", "Black", 1200));
        return truckList;
    }
}
