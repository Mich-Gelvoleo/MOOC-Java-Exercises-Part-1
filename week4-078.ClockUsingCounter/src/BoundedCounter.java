/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void setValue(int value){
        if(value > 0 && value <= this.upperLimit){
            this.value = value;
        }
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void next(){
        if(this.value < this.upperLimit){
            this.value++;
        }
        else{
            this.value = 0;
        }
    }
    
    public String toString(){
        if(this.value < 10){
            return "0" + this.value;
        }
        return "" + this.value;
    }
}
