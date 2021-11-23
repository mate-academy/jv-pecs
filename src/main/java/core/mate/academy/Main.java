package core.mate.academy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineService;
import core.mate.academy.service.MachineServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MachineService<Machine> machineService = new MachineServiceImpl();

        List<Machine> bulldozers = machineService.getAll(Bulldozer.class);
        machineService.startWorking(bulldozers);

        List<Machine> excavators = machineService.getAll(Excavator.class);
        machineService.startWorking(excavators);

        List<Machine> trucks = machineService.getAll(Truck.class);
        machineService.startWorking(trucks);

    }
}
