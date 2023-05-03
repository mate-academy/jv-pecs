package core.mate.academy.model;

public abstract class Machine implements Workable {
    public static final String DEFAULT_NAME = "Pussy_waggon";
    public static final String DEFAULT_COLOUR = "White";
    private String name;
    private String color;

    Machine() {
        this.name = DEFAULT_NAME;
        this.color = DEFAULT_COLOUR;
    }

    Machine(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
