package com.gubenkoDM.RPS;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by DmitriX on 21.03.2017.
 */

/*
 Реализация взаимодействия пользователя с игрой
 Пользовательский интерфейс=Controller+View
 */

public class Controller {
    public int getUserNumber(){
        return 2;
    }

    public Vector<Integer> getFieldSize(){
        Vector<Integer> vector=new Vector<>();
        vector.add(7);
        vector.add(7);
        return  vector;
    }
}
