package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator jsb = new Excavator("jcb 3trx", "yellow",
                2000,
                400);
        Excavator trx = new Excavator("trx 800pro", "red",
                2200,
                450);
        return List.of(jsb, trx);
    }
}
