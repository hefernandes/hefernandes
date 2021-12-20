import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
public class Exxercicio2 {
    public static void main(String[] args) throws Exception {
    
        Integer[] array = {52,10,85,1324,01,13,62,30,12,127};
        
        //Imprime o Array
        System.out.println("Depois");
        Arrays.sort(array, Collections.reverseOrder());
        for(int i: array)
            System.out.println(i);
        }
    }

