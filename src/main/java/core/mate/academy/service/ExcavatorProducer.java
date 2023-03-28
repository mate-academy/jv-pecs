package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator komatsu = new Excavator("Komatsu PC1250-11", 820, 2023, 125000);
        Excavator hitachi = new Excavator("Hitachi ZX870-6", 541, 2015, 87000);
        Excavator caterpillar = new Excavator("Caterpillar 336E", 224, 2017, 36000);
        return List.of(komatsu, hitachi, caterpillar);
    }
}
