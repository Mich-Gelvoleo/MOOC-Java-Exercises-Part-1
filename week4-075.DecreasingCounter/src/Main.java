public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(5);

        counter.printValue();
        counter.decrease();
        
        counter.reset();
        counter.printValue();
        
        counter.setInitial();
        counter.printValue();
    }
}
