package core.mate.academy.service.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private Excavator dragline = new Excavator("Dragline excavator", 50, 12,
            3, 364, "HS 8300 MINING DRAGLINE", "White");
    private Excavator skid = new Excavator("Skid excavator", 2, 2,
            10, 6, "Mecalac Group 6MCR", "Yellow");
    private Excavator crawler = new Excavator("Crawler Excavator", 10, 7,
            6, 113, "Liebherr R 9100 G6", "Green");

    @Override
    public List<? extends Machine> get() {
        return List.of(dragline, skid, crawler);
    }
}
