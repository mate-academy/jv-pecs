package core.mate.academy.model;

public interface Constants {
    String[] COLORS = {"black",
            "white",
            "gray",
            "red",
            "blue",
            "yellow",
            "green",
            "pink",
            "violet"
    };
    double MIN_BULLDOZER_WEIGHT = 3;
    double MAX_BULLDOZER_WEIGHT = 20;
    double MIN_BULLDOZER_HEIGHT = 1;
    double MAX_BULLDOZER_HEIGHT = 5;
    double MIN_BULLDOZER_BLADE_WIDTH = 2;
    double MAX_BULLDOZER_BLADE_WIDTH = 8;

    int MIN_TRUCK_WHEEL_NUM = 4;
    int MAX_TRUCK_WHEEL_NUM = 24;
    double MIN_TRUCK_CARGO_WEIGHT = 10;
    double MAX_TRUCK_CARGO_WEIGHT = 70;

    double MIN_EXCAVATOR_BUCKET_VOLUME = 10;
    double MAX_EXCAVATOR_BUCKET_VOLUME = 100;
    int MIN_EXCAVATOR_DIGGING_DEPTH = 3;
    int MAX_EXCAVATOR_DIGGING_DEPTH = 20;
}
