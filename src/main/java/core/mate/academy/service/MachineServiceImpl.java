package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<M> implements MachineService<M> {
    @Override
    public List<M> getAll(Class<? extends M> type) {
        if (type == Truck.class) {
            return new TruckProducerImpl<M>().get();
        } else if (type == Bulldozer.class) {
            return new BulldozerProducerImpl<M>().get();
        } else if (type == Excavator.class) {
            return new ExcavatorProducerImpl<M>().get();
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super M> machines, M value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends M> machines) {

    }
}
