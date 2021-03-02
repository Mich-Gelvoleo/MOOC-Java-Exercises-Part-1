/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
import java.util.*;

public class Records {

    //===============================================================
    // Properties
    //===============================================================

    private ArrayList<Bird> birds = new ArrayList<Bird>();

    //===============================================================
    // Methods
    //===============================================================

    public void add(String name, String latinName){
        Bird bird = new Bird(name, latinName);
        birds.add(bird);
    }
    
    public void statistics(){
        for(int i=0; i<birds.size(); i++){
            System.out.print(birds.get(i));
            System.out.println(birds.get(i).getCount());
        }
    }
    
    public void observe(String name){
        
        for(int i=0; i<birds.size(); i++){
            if(birds.get(i).getName().equals(name)){
                birds.get(i).count();
                return;
            }
        }
        
        System.out.println("Is not a bird!");
    }
    
    public void show(String name){
        for(int i=0; i<birds.size(); i++){
            if(birds.get(i).getName().equals(name)){
                System.out.print(birds.get(i));
                System.out.println(birds.get(i).getCount());
            }
        }
    }
}
