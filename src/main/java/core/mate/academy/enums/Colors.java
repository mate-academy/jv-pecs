package core.mate.academy.enums;

public enum Colors implements Picker {
    WHITE,
    RED,
    YELLOW,
    GREEN,
    BLUE,
    PURPLE,
    BLACK;

    public static String random() {
        return Picker.random(values());
    }
}
