package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavatorKamatsu = new Excavator("Kamatsu", "Yellow",
                2.5, 0.3, 2.4);
        Excavator excavatorCaterpiller = new Excavator("Caterpiller", "Red",
                3.1, 0.5, 3.4);
        Excavator excavatorVolvo = new Excavator("Volvo", "Blue",
                5.0, 1.0, 3.0);
        return List.of(excavatorKamatsu, excavatorCaterpiller, excavatorVolvo);
    }
}
