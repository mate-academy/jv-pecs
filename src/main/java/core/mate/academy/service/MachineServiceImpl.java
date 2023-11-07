package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozerProduce bulldozerProduce = new BulldozerProduce();
            List<? extends Machine> bulldozers = bulldozerProduce.get();
            return new ArrayList<>(bulldozers);
        }

        if (type == Excavator.class) {
            ExcavatorProduce excavatorProduce = new ExcavatorProduce();
            List<Excavator> excavators = excavatorProduce.get();
            return new ArrayList<>(excavators);
        }

        if (type == Truck.class) {
            TruckProduce truckProduce = new TruckProduce();
            List<Truck> trucks = truckProduce.get();
            return new ArrayList<>(trucks);
        }

        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        machines.replaceAll(ignored -> (Machine) value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

