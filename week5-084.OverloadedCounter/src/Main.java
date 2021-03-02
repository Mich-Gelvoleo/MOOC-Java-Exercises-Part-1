public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter first = new Counter(900, false);
        
        first.decrease(-55);
        System.out.println(first.value());

    }
}
