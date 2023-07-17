package core.mate.academy.service.producers;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> array = Arrays.asList(
                new Excavator("Excavator1", "Red", "ChinaChain"),
                new Excavator("Excavator2", "Red", "GermanyChain"));
        return array;
    }
}
