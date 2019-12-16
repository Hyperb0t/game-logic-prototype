package ru.itis.tanchiki.gamelogic;

import ru.itis.tanchiki.gamelogic.celltypes.Cell;

public class GameState {

    //БОЛЬШОЙ ВОПРОС: отдельный список сущностей или сущность как клетка (сущность в данном случае - например танк)
    //отсюда: клетка сама является танком или хранит указатель на танк

    private Cell[][] cells = new Cell[10][10];
}
