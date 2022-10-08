package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProduser;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private BulldozerProducer bulldozerProduser = new BulldozerProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProduser truckProduser = new TruckProduser();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type != null) {
            if (type == Bulldozer.class) {
                return new ArrayList<>(bulldozerProduser.get());
            }
            if (type == Excavator.class) {
                return new ArrayList<>(excavatorProducer.get());
            }
            if (type == Truck.class) {
                return new ArrayList<>(truckProduser.get());
            }
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        if (machines != null) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, value);
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine mashine : machines) {
            mashine.doWork();
        }
    }
}
