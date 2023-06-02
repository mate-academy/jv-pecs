package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

public interface MachineProducer <T>{
    Machine buldozer1 = new Bulldozer();
    Machine excavator1 = new Excavator();
    Machine truck1 = new Truck();
    List<? extends Machine> machines = List.of(buldozer1, excavator1, truck1);
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    List<Object> get();
}
