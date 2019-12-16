package ru.itis.tanchiki.gamelogic.celltypes;

public class Tank extends Cell {
    //т.к. танк может находиться не только в центре клетки, ему нужно ввести "сдвиги по обеим осям"
    // соотв. если двиг становится больше 0.5 (где 1 - размер клетки), то танк перемещается в другую клетку
    // и сдвиги для него пересчитываются примерно так newShiftX = 1-oldShitX
    private float shiftX; //0 <= shiftX <= 0.5 если танк хранится как клетка в массиве GameState
    private float shiftY;
    private Direction direction; //направление дула
    private int hp;

    enum Direction{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
