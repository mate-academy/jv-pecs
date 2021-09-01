package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private Excavator excavator1 = new Excavator(15, false, false,
            "Cat312E", "Yellow");
    private Excavator excavator2 = new Excavator(5, true, false,
            "KobelcoSK28SR", "Green");
    private Excavator excavator3 = new Excavator(10, false, true,
            "LiebherrA910", "White");

    @Override
    public List<Excavator> get() {
        return List.of(excavator1, excavator2, excavator3);
    }
}
