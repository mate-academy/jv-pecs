package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<Bulldozer> bulldozers = new BulldozerProducer().get();
            return new ArrayList<>(bulldozers);
        }
        if (type == Excavator.class) {
            List<Excavator> excavators = new ExcavatorProducer().get();
            return new ArrayList<>(excavators);
        }
        if (type == Truck.class) {
            List<Truck> trucks = new TruckProducer().get();
            return new ArrayList<>(trucks);
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines,value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine: list) {
            machine.doWork();
        }
    }
}
