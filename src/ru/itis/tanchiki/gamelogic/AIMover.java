package ru.itis.tanchiki.gamelogic;

import ru.itis.tanchiki.gamelogic.celltypes.Tank;

public class AIMover {

    //решить какой вариант выбрать

    public Tank updateTank(Tank oldTank) {
        //возможно придется вводить отедльную функцию по типу validate
        //которая проверяет можно ли при данной игровой ситуации превратить oldTank в newTank
        return null;
    }
        
    public GameState updateGameState(GameState oldGameState) {
        // с этим вариантом проще анализировать, может ли танк совершить такое движение
        //например есть ли стена или другой танк на пути
        //и если препятствие есть то GameState не менять
        return null;
    }
}
