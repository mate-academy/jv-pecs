package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    private List<? extends Machine> bulldozers = new ArrayList<>();
    private MachineService<Bulldozer> bulldozerService = new MachineServiceImpl();

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setPower(1000);
        bulldozer.setName("Bulldozer");
        bulldozer.setColor("Blue");

        bulldozerService.fill((List<? super Machine>) bulldozers, bulldozer);
        return (List<Bulldozer>) bulldozers;
    }
}
