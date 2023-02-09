package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator volvo = new Excavator();
        volvo.setBoomType("Standart");
        volvo.setCounterWeight(800);
        volvo.setName("Volvo");
        volvo.setColor("Red");
        Excavator caterpillar = new Excavator();
        caterpillar.setBoomType("Long-Reach Boom");
        caterpillar.setCounterWeight(1400);
        caterpillar.setName("CAT");
        caterpillar.setColor("Yellow");
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(volvo);
        excavatorList.add(caterpillar);
        return excavatorList;
    }
}
