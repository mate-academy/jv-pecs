package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Machine> get() {
        final Machine excavator1 = new Excavator("Cat C7", 1.43F);
        final Machine excavator2 = new Excavator("318D2L",13.7f);
        final Machine excavator3 = new Excavator("M317D2",12.2f);
        excavator1.setName("Universal");
        excavator1.setColor("Yellow");
        excavator2.setName("Mine");
        excavator2.setColor("Black");
        excavator3.setName("Career");
        excavator3.setColor("Braun");
        return List.of(excavator1,excavator2,excavator3);
    }
}
