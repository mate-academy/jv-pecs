package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator("blue", "Catetpiler","10","120"));
        excavatorList.add(new Excavator("white", "kozak","12","150"));
        excavatorList.add(new Excavator("red", "Ukraine","18","320"));
        return excavatorList;
    }
}
