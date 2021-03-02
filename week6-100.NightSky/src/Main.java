
public class Main {

    public static void main(String[] args) {
        // Test your code here
        NightSky sky = new NightSky(0.1, 5, 5);
        
        sky.print();
        System.out.println(sky.starsInLastPrint());
        System.out.println("");
        
        sky.print();
        System.out.println(sky.starsInLastPrint());
    }
}
