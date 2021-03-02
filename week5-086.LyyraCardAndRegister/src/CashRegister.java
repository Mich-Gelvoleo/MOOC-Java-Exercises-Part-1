
public class CashRegister {

    private double cashInRegister;
    private int economicalSold = 0;
    private int gourmetSold = 0;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens    
        double econPrice = 2.50;
        double change;
        
        if(cashGiven >= econPrice){
            this.cashInRegister += econPrice;
            this.economicalSold++;
            change = cashGiven - econPrice;
            return change;
        }
        else{
            return cashGiven;
        }
    }
    
    public boolean payEconomical(LyyraCard card){
        double econPrice = 2.50;
        
        if(card.balance() >= econPrice){
            this.economicalSold++;
            card.pay(econPrice);
            return true;
        }
        else{
            return false;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double gourmPrice = 4.00;
        double change;
        
        if(cashGiven >= gourmPrice){
            this.cashInRegister += gourmPrice;
            this.gourmetSold++;
            change = cashGiven - gourmPrice;
            return change;
        }
        else{
            return cashGiven;
        }
    }
    
    public boolean payGourmet(LyyraCard card){
        double gourmPrice = 4.00;
        
        if(card.balance() >= gourmPrice){
            this.gourmetSold++;
            card.pay(gourmPrice);
            return true;
        }
        else{
            return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum >= 0){
             card.loadMoney(sum);
             this.cashInRegister += sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
