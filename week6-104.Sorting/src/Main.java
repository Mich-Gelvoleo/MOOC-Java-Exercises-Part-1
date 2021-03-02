
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array){
        int i;
        int least = array[0];
        
        for(i=0; i<array.length; i++){
            if(array[i] < least){
                least = array[i];
            }
        }
        return least;
    }
    
    public static int indexOfTheSmallest(int[] array) {
       // code goes here
       int index = 0;
       int i;
       int least = array[0];
        
        for(i=0; i<array.length; i++){
            if(array[i] < least){
                least = array[i];
                index = i;
            }
        }
       
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
       int leastIndex = index;
       int i;
       int least = array[index];
        
        for(i=index; i<array.length; i++){
            if(array[i] < least){
                least = array[i];
                leastIndex = i;
            }
        }
       
        return leastIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        
    }
    
    public static void sort(int[] array) {
        int index1;
        
        for(int i=0; i<array.length;i ++){
            index1 = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index1);
            System.out.print("[");
            for(int j = 0; j<array.length; j++){
                if(j == array.length - 1){
                    System.out.print(array[j]);
                }
                else{
                    System.out.print(array[j] + ", ");
                }
            }
            System.out.print("]");
            System.out.println("");
        }
    }
  

}
