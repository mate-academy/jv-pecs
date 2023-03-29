package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private static String nameOfMachine;
    private static String type;
    private static int mass;
    private static int powerOfEngin;

    public Bulldozer() {
    }

    public static String getNameOfMachine() {
        return nameOfMachine;
    }

    public static void setNameOfMachine(String nameOfMachine) {
        Bulldozer.nameOfMachine = nameOfMachine;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Bulldozer.type = type;
    }

    public static int getMass() {
        return mass;
    }

    public static void setMass(int mass) {
        Bulldozer.mass = mass;
    }

    public static int getPowerOfEngin() {
        return powerOfEngin;
    }

    public static void setPowerOfEngin(int powerOfEngin) {
        Bulldozer.powerOfEngin = powerOfEngin;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
