package core.basesyntax;

import java.util.Random;

public class Ball {
    private int number;
    private String color;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color = " + color + ", number = " + number;
    }
}
