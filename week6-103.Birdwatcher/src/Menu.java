x/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
import java.util.*;

public class Menu {

    public void menu(Scanner reader){
        String choice;
        String name;
        String latinName;
        
        boolean check = true;
        
        Records record = new Records();
        
        System.out.println("Menu Commands: ");
        System.out.println("Add");
        System.out.println("Observation");
        System.out.println("Statistics");
        System.out.println("Show");
        System.out.println("Quit");
        
        while(check){
        System.out.print("? ");
        choice = reader.nextLine();
        
            if(choice.equals("Add")){
                System.out.print("Name: ");
                name = reader.nextLine();
                
                System.out.print("Latin Name: ");
                latinName = reader.nextLine();
                
                record.add(name, latinName);
                
            } else if(choice.equals("Observation")) {
                System.out.print("What was observed:? ");
                name = reader.nextLine();
                
                record.observe(name);
            } else if(choice.equals("Statistics")) {
                record.statistics();
            }
            
            else if(choice.equals("Show")){
                System.out.print("What? ");
                name = reader.nextLine();
                
                record.show(name);
            }
            
            else if(choice.equals("Quit")){
                check = false;
            }
            else{
                System.out.println("Invalid Command.");
            }
        }
                
    }
}
