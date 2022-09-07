package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    /**
     * Return the list of machines.
     * In the implementation of this method please use your MachineProducer implementations
     * See that 'Class type' is not parametrized.
     * Consider to parametrize this Class< PARAMETRIZE_ME > with specific wildcard bounding
     *
     * @param type - any class of Machine sub class. For example: Truck.class or Bulldozer.class
     * @return the list of machines
     */
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer;
        if (Bulldozer.class.equals(type)) {
            machineProducer = new BulldozerProducer();
        } else if (Excavator.class.equals(type)) {
            machineProducer = new ExcavatorProducer();
        } else if (Truck.class.equals(type)) {
            machineProducer = new TruckProducer();
        } else {
            return new ArrayList<>();
        }
        return (List<Machine>)machineProducer.get();
    }

    /**
     * Fill the machines list with passed value
     * Replace the Object with parametrized value.
     * This method should be able to work well with any type of machine passed as 'value'
     *
     * @param machines - list of machines to be filled with value
     * @param value    - any object of machine sub class
     */
    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as list of trucks.
     *
     * @param machines - the list of machines
     */
    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
