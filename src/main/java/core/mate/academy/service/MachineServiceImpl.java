package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.CustomException;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.RussianWarship;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * ARE THE INITIAL getALL TESTS FOR LISTS FAULTY????
 *?
 * ?
 *  ?
 *   ?
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
     public List<? extends Machine> getAll(Class<? extends Machine> type) {
        if (type == RussianWarship.class) {
            throw new CustomException("Go back home Russian Warship");
        }
        if (type == Bulldozer.class) {
            return MachineProducer.getBulldozers();
        }
        if (type == Excavator.class) {
            return MachineProducer.getExcavators();
        }
        if (type == Truck.class) {
            return MachineProducer.getTrucks();
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
