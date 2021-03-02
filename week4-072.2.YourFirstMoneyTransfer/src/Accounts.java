
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account matt = new Account("Matt's account", 1000.00);
        
        Account other = new Account("My account", 0.00);
        
        matt.withdrawal(100.00);
        other.deposit(100.00);
        
        System.out.println(matt);
        System.out.println(other);
    }

}
