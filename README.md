# jv-pecs

1. You have abstract class `Machine` and three sub-classes: `Bulldozer`, `Excavator` and `Truck`. Feel free to add some type-specific fields to these classes.
1. Each machine has the ability to start working.
1. There is MachineProducer interface created.
The goal of implementation of this interface is to create a list of specific machines (`Bulldozer`, `Excavator` and `Truck`). 
You should have at least 3 implementations: `BulldozerProducer`, `ExcavatorProducer`, `TruckProducer`;
Please parameterize your `MachineProducer` and replace `Object` in `get()` with the suitable option.
    ```java
    public interface MachineProducer<PARAMETRIZE ME>{ ... }
    ```
1. In `MachineProducer` implementations your method `get()` should return the list of specific machines. 
For example: 
    ```java
    List<Bulldozer> get();
    ```
    or 
    ```java
    List<Truck> get();
    ```
    or 
    ```java
    List<Excavator> get();
    ```

1. There is also `MachineService` interface created. You need to parameterize it as well and 
replace `Object` in method signature with the right option (use PECS):

    - the method `getAll(Class type)` produces the list of machines based on the input param.
    - the method `fill(List<Object> machines, Object value)` fills the machines list with passed value.
    - the method `startWorking()` should be able to accept a list containing any Machine.

When you parameterize interface `MachineService` keep in mind that we want to restrict types that can be used with it.

Not allow:  
~~`MachineServiceImpl implements MachineService<Dog>`~~  
Allow:  
`MachineServiceImpl implements MachineService<Truck>`  
``
1. Use the created class `MachineServiceImpl` implementing MachineService and realize these methods:
- `getAll(Class type)`- based on the input class type, choose the right MachineProducer implementation and call its `get()` method.

For example: `if (type == Bulldozer.class)` - we should call the `get()` method from right implementation of MachineProducer (the one that will return `List<Bulldozer>`) and return these machines.

- `fill(List<Object> machines, Object value)` - update to the passed value (**which can be of any Machine subtype**) all elements in the `machines` list.

- `startWorking()` - call `doWork` on every Machine in the list.

#### [Try to avoid these common mistakes while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/pecs/pecs.html)

1. У вас є абстрактний клас `Машина` і три підкласи: `Бульдозер`, `Екскаватор` і `Вантажівка`. Не соромтеся додавати до цих класів поля, що стосуються певного типу.
1. Кожна машина має можливість почати роботу.
1. Створено інтерфейс MachineProducer.
   Метою реалізації цього інтерфейсу є створення списку конкретних машин (`Бульдозер`, `Екскаватор` і `Вантажівка`).
   Ви повинні мати принаймні 3 реалізації: `BulldozerProducer`, `ExcavatorProducer`, `TruckProducer`;
   Будь ласка, параметризуйте свій `MachineProducer` і замініть `Object` у `get()` відповідним параметром.
     ```java
     публічний інтерфейс MachineProducer<PARAMETRIZE ME>{ ... }
     ```
1. У реалізаціях `MachineProducer` ваш метод `get()` має повертати список конкретних машин.
   Наприклад:
     ```java
     List<Bulldozer> get();
     ```
   або
     ```java
     List<Truck> get();
     ```
   або
     ```java
     List<Excavator> get();
     ```

1. Також створено інтерфейс `MachineService`. Вам також потрібно його параметризувати і
   замініть `Object` у підписі методу на правильний параметр (використовуйте PECS):

   - метод getAll(Class type) створює список машин на основі вхідного параметра.
   - метод `fill(List<Object> machines, Object value)` заповнює список машин переданим значенням.
   - метод `startWorking()` повинен мати можливість приймати список, що містить будь-яку машину.

Коли ви параметризуєте інтерфейс `MachineService`, майте на увазі, що ми хочемо обмежити типи, які можна використовувати з ним.

Не дозволяє:
~~`MachineServiceImpl реалізує MachineService<Dog>`~~
Дозволити:
`MachineServiceImpl реалізує MachineService<Truck>`
``
1. Використовуйте створений клас `MachineServiceImpl`, що реалізує MachineService, і реалізуйте ці методи:
- `getAll(Class type)`- на основі типу вхідного класу виберіть правильну реалізацію MachineProducer і викличте його метод `get()`.

Наприклад: `if (type == Bulldozer.class)` - ми повинні викликати метод `get()` із правої реалізації MachineProducer (той, який повертатиме 
`List<Bulldozer>`) і повертати ці машини.

- `fill(List<Object> machines, Object value)` - оновити до переданого значення (**яке може бути будь-якого підтипу Machine**) 
- усіх елементів у списку `machines`.

- `startWorking()` - викликати `doWork` на кожній машині в списку.

#### [Намагайтеся уникати цих поширених помилок під час вирішення завдання](https://mate-academy.github.io/jv-program-common-mistakes/java-core/pecs/pecs.html)