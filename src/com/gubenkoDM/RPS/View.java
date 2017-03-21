package com.gubenkoDM.RPS;

import java.util.Vector;

/**
 * Created by DmitriX on 21.03.2017.
 */
/*
    Реализация представления для игры
 */

public class View {
    private int userNumber;
    private int xSize;
    private int ySize;

    public View(int userNumber, Vector<Integer> fieldSize) {
        this.userNumber=userNumber;
        this.xSize=fieldSize.get(0);
        this.ySize=fieldSize.get(1);
    }

    public void draw() {
        //рисуем игровое поле
    }
}
