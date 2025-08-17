package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator caseExcavator = new Excavator("CASE", "Red", 10201, 16.5);
    private Excavator caterpillarExcavator = new Excavator("Caterpillar", "White", 10451, 20.0);
    private Excavator liebherrExcavator = new Excavator("Liebherr", "Yellow", 105401, 15.7);

    @Override
    public List<Excavator> get() {
        return List.of(caseExcavator, caterpillarExcavator, liebherrExcavator);
    }
}
