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
        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Scania", "White", 189));
        trucks.add(new Truck("Man", "Brown", 180));
        trucks.add(new Truck("Mercedes", "White", 200));
        return trucks;
    }
}
