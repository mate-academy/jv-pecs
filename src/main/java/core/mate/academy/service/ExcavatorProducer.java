package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
  private List<Excavator> excavatorsList;

  public ExcavatorProducer() {
    excavatorsList.add(new Excavator("Bob", "yellow", 15, "JCB"));
    excavatorsList.add(new Excavator("Tom", "red", 20, "CAT"));
  }

  @Override
  public List<Excavator> get() {
    return excavatorsList;
  }
}
