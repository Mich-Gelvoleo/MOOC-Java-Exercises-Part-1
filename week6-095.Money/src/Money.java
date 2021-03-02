
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money added){
        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;
        
        Money newBalance = new Money(euros, cents);
        return newBalance;
    }
    
    public Money minus(Money decremented){
        int euros = this.euros - decremented.euros;
        int cents;
        
        if(euros > 0){
            if(this.cents < decremented.cents){
                euros -= 1;
                cents = (this.cents + 100) - decremented.cents;
            }
            else{
                cents = this.cents - decremented.cents;
            }
        }
        else{
            euros = 0;
            cents = 0;
        }
        
        Money newBalance = new Money(euros, cents);
        return newBalance;
    }
    
    public boolean less(Money compared){
        boolean check = true;
        
        if(this.euros < compared.euros){
            check = true;
        }
        else if(this.euros == compared.euros){
            if(this.cents < compared.cents){
                check = true;
            }
            else{
                check = false;
            }
        }
        else{
            check = false;
        }
        
        return check;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
