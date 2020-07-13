# jv-pecs

1. You have abstract class `Machine` and three sub-classes: `Bulldozer`, `Excavator` and `Track`.
1. Each machine has the ability to start working.
1. There is MachineProducer interface created.
The goal of this interface is to create a list of specific machines (`Bulldozer`, `Excavator` and `Track`). 
Please parametrize it with the correct type. As well replace `Object` with right option.
    ```java
    public interface MachineProducer<PARAMETRIZE ME>{ ... }
    ```
1. Add three implementations for MachineProducer interface. As a result in these implementations you method `get` should return the list of specific machines. 
For example: 
    ```java
    List<Bulldozer> get();
    ```
    or 
    ```java
    List<Track> get();
    ```
    or 
    ```java
    List<Excavator> get();
    ```

1. There is created MachineService interface.
MachineService has method `List<Object> getAll(Class type);`.
This method will produce the list of machines based on input param. Replace `Object` with right option.

1. Replace `Object` with right option in method `void startWorking(List<Object> machines);`;
This method should be able to accept List of Bulldozers as well as List of Tracks. Use PECS here.

1. Add implementation of MachineService. Override method `List<Object> getAll(Class type);`.
Remember: This method will produce the list of machines based on input param.
For example: 
- `if (type == Bulldozer.class)` - we should call the `get` method from right implementation of MachineProducer
 (which one will return `List<Bulldozer> get();`) and return these machines.
- `if (type == Track.class)` - we should call `List<Track> get();` 
method and return these machines.
