/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
public class Counter {
    private int startingValue;
    private boolean check;
    
    public Counter(int initialValue, boolean checker){
        this.startingValue = initialValue;
        this.check = checker;
    }
    
    public Counter(int initialValue){
        this(initialValue, false);
    }
    
    public Counter(boolean checker){
        this(0, checker);
    }
    
    public Counter(){
        this(0, false);
    }
    
    public int value(){
        return this.startingValue;
    }
    
    public void increase(){
        this.startingValue++;
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount > 0){
            this.startingValue += increaseAmount;
        }
    }
    
    public void decrease(){
        if(this.check && this.startingValue > 0){
            this.startingValue--;
        }
        else if(!this.check){
            this.startingValue--;
        }
    }
    
    public void decrease(int decreaseAmount){
        int result;
        if(decreaseAmount > 0){
            if(this.check){
                result = this.startingValue - decreaseAmount;
                if(result < 0){
                    this.startingValue = 0;
                }
                else{
                    this.startingValue = result;
                }
            }
            else{
                this.startingValue -= decreaseAmount;
            }
        }
    }
}
