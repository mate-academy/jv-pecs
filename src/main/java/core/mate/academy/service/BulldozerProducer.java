package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer ikeaBulldozer = new Bulldozer("IKEA", 34);
        Bulldozer constructionBulldozer = new Bulldozer("ConstructCompany", 60);
        Bulldozer cleanerBulldozer = new Bulldozer("City Clean", 45);
        return List.of(ikeaBulldozer, constructionBulldozer, cleanerBulldozer);
    }
}
