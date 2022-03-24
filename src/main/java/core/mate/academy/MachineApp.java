package core.mate.academy;

import core.mate.academy.model.Machine;
import core.mate.academy.service.BulldozerProducer;
import core.mate.academy.service.ExcavatorProducer;
import core.mate.academy.service.TruckProducer;
import java.util.List;

public class MachineApp {
    public static void main(String[] args) {
        List<List<? extends Machine>> machines = List.of(
                new BulldozerProducer().get(),
                new ExcavatorProducer().get(),
                new TruckProducer().get()
        );

        for (List<? extends Machine> machineList : machines) {
            machineList.forEach(x -> System.out.println(x.toString()));
        }
    }
}
