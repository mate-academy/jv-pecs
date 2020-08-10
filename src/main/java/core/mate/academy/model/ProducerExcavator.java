package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ProducerExcavator implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator firstExcavator = new Excavator();
        Excavator secondExcavator = new Excavator("Cyclical action", 10000);
        List<Excavator> answer = new ArrayList<>();
        answer.add(firstExcavator);
        answer.add(secondExcavator);
        return answer;
    }
}
