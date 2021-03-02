/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
public class Bird {
    private String name;
    private String latinName;
    private int count = 0;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }
    
    public void count(){
        this.count++;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return "" + name + " (" + latinName + "): ";
    }
}
