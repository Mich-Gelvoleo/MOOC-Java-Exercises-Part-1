
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array){
        int size = array.length;
        int[] container = new int[size];
        
        for(int i=0; i<array.length; i++){
            container[i] = array[i];
        }
        
        return container;
    }
    
    public static int[] reverseCopy(int[] array){
        int size = array.length;
        int[] container = new int[size];
        
        for(int i=0; i<array.length; i++){
            container[i] = array[(array.length - 1) - i];
        }
        
        return container;
    }
    
}
