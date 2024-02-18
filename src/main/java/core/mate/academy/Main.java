package core.mate.academy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.BulldozerProducer;
import core.mate.academy.service.ExcavatorProducer;
import core.mate.academy.service.MachineService;
import core.mate.academy.service.MachineServiceImpl;
import core.mate.academy.service.TruckProducer;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MachineService machineService = new MachineServiceImpl();
        BulldozerProducer bulldozerProducer = new BulldozerProducer();
        ExcavatorProducer excavatorProducer = new ExcavatorProducer();
        TruckProducer truckProducer = new TruckProducer();

        List<Machine> bulldozers;
        bulldozers = machineService.getAll(Bulldozer.class);
        System.out.println(bulldozers);
    }

}
