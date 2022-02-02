package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

  @Override
  public List<Excavator> get() {
    Excavator excavator1 = new Excavator(234, 34);
    Excavator excavator2 = new Excavator(256, 60);
    Excavator excavator3 = new Excavator(546, 120);
    return List.of(excavator1, excavator2, excavator3);
  }
}
