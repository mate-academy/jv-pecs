package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> produce() {
        Excavator jcb = new Excavator();
        jcb.setType("245HD LR");
        jcb.setWeight(23850);
        jcb.setEnginePower(104);
        jcb.setBucketCapacity(1.2);
        jcb.setName("JCB");
        jcb.setColor("Yellow");

        Excavator hyundai = new Excavator();
        hyundai.setType("R340L Smart");
        hyundai.setWeight(33800);
        hyundai.setEnginePower(206);
        hyundai.setBucketCapacity(2.1);
        hyundai.setName("Hyundai");
        hyundai.setColor("White");

        List<Excavator> excavators = new ArrayList<>();
        excavators.add(jcb);
        excavators.add(hyundai);
        return excavators;
    }
}
