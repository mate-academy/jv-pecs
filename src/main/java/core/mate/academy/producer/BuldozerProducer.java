package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BuldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("LoveDozer", "red", 3, 5));
        bulldozers.add(new Bulldozer("DarkKnight", "black", 1, 3));
        return bulldozers;
    }
}
