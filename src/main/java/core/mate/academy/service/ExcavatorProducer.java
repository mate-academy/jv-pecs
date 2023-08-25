package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<? extends Machine> excavators = new ArrayList<>();
    private MachineService<Excavator> excavatorService = new MachineServiceImpl();

    @Override
    public List<Excavator> get() {
        Excavator excavator = new Excavator();
        excavator.setWeight(100);
        excavator.setColor("Red");
        excavator.setName("Excavator");

        excavatorService.fill((List<? super Machine>) excavators, excavator);

        return (List<Excavator>) excavators;
    }
}
