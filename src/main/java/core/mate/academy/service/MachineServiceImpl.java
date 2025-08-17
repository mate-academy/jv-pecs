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
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> resultList = new ArrayList<>();
        if (type == Bulldozer.class) {
            List<Bulldozer> bulldozerList = new BulldozerProducer().get();
            for (int i = 0; i < bulldozerList.size(); i++) {
                resultList.add(bulldozerList.get(i));
            }
        } else if (type == Excavator.class) {
            List<Excavator> excavatorList = new ExcavatorProducer().get();
            for (int i = 0; i < excavatorList.size(); i++) {
                resultList.add(excavatorList.get(i));
            }
        } else if (type == Truck.class) {
            List<Truck> truckList = new TruckProducer().get();
            for (int i = 0; i < truckList.size(); i++) {
                resultList.add(truckList.get(i));
            }
        } else {
            return new ArrayList<Machine>();
        }
        return resultList;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}
