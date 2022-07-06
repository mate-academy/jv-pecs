package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? super Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class){
            BulldozerProducer buljdosers = new BulldozerProducer();
             machines.addAll(buljdosers.get());
        }
        return (List<Machine>) machines;
    }

    @Override
    public void fill(List<? super Machine> list, Object value) {

    }

    @Override
    public void startWorking(List<? extends Machine> list) {

    }
}
