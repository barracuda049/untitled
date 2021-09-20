package ru.tpu.hiearhia;

public class Room {
    private int numberOfStage;
    private String type;
    private int square;

    public Room(int numberOfStage, String type, int square)
    {
        this.numberOfStage = numberOfStage;
        this.square = square;
        this.type = type;
    }

    public int getSquare() {
        return square;
    }

    public String getType() {
        return type;
    }

    public String toString()
    {
        return "Номер этажа - " + numberOfStage + "; Тип комнаты - " + type + "; Площадь - " + square;
    }
}
