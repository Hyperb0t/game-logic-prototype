package ru.itis.tanchiki.gamelogic.celltypes;

public class Bullet extends Cell {
    //т.к. танк может находиться не только в центре клетки, ему нужно ввести "сдвиги по обеим осям"
    // соотв. если двиг становится больше 0.5 (где 1 - размер клетки), то танк перемещается в другую клетку
    // и сдвиги для него пересчитываются примерно так newShiftX = 1-oldShitX
    private float shiftX;
    private float shiftY;
    private Tank.Direction direction; //направление дула

    enum Direction{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
