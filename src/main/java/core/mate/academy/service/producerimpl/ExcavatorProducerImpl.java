package core.mate.academy.service.producerimpl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        IntStream.range(1, 10)
                .forEach(i -> excavators.add(new Excavator()));
        return excavators;
    }
}
