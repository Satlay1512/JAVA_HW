package Seminars.Home_work;
/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HW2_002 {
    private static Logger logger = Logger.getLogger(HW2_002.class.getName());
    public static void main(String[] args) {
        int[] array = {1, 6, 2, 3, 9, 0, 4 };
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    private static void bubbleSort(int[] array) {
        for (int ceiling = array.length; ceiling >= 0; ceiling --){
            for (int i = 0; i < ceiling && i + 1 < ceiling; i++) {
                if (array[i]> array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    logger.log (Level.INFO,String.format("%d <-> %d, %s",
                        array[i], array[i+1], Arrays.toString(array)));
                }
                
            }
        }
        
    }
}
