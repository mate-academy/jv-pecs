package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setBladeType("Mirro");
        bulldozer1.setBladeWeight(23.0);
        bulldozer1.setHasRipper(true);
        
        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setBladeType("Mirro");
        bulldozer2.setBladeWeight(23.0);
        bulldozer2.setHasRipper(true);
        
        Bulldozer bulldozer3 = new Bulldozer();
        bulldozer3.setBladeType("Mirro");
        bulldozer3.setBladeWeight(23.0);
        bulldozer3.setHasRipper(true);
        
        return bulldozers;
    }
}
