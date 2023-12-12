package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {

    @Override
    public List<? extends Machine> getAll(Class type) {
        String typeMachine = type.getSimpleName();
        switch (typeMachine) {
            case "Truck":
                return new Truck().get();
            case "Excavator":
                return new Excavator().get();
            case "Bulldozer":
                return new Bulldozer().get();
            default:
                return new ArrayList<>();
        }
    }

    @Override
    public void fill(List machines, Object value) {

    }

    @Override
    public void startWorking(List list) {
    }
}
