package core.mate.academy.enums;

public enum Models implements Picker {
    MAN,
    DAF,
    MERCEDES_BENZ,
    SCANIA,
    IVECO,
    VOLVO,
    RENAULT;

    public static String random() {
        return Picker.random(values());
    }
}
