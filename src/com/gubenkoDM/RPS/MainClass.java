package com.gubenkoDM.RPS;

/**
 * Created by DmitriX on 21.03.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        //create Controller
        Controller controller=new Controller();
        //Start UI
        StartView startView=new StartView();
        startView.draw();
        //UI
        View view=new View(controller.getUserNumber(),controller.getFieldSize());
        view.draw();


    }
}
