package Main;

import Controller.ControllerDatabase;
import View.MainMenu;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        for(int i=0;i<ControllerDatabase.getAllUsernames().size();i++){
//            System.out.println(ControllerDatabase.getAllUsernames().get(i));
//        }
        new MainMenu();
    }
}
