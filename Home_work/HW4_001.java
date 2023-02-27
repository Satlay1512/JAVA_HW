package Seminars.Home_work;

import java.util.LinkedList;

/*
 Пусть дан LinkedList с несколькими элементами. 
 Реализуйте метод, который вернет “перевернутый” список.
 */

public class HW4_001 {
    public static void main(String[] args) {
       int[] listMas = {5,4,6,5,9,7,5,1};
       LinkedList<Integer> linkedList = new LinkedList<>();
       for (Integer temp : listMas) {
           linkedList.add(temp);
        }
        int temp = 0;
        while (temp != linkedList.size() - 1) {
            linkedList.add(linkedList.size() - temp, linkedList.getFirst());
            linkedList.removeFirst();
            temp++;
        }   
        System.out.println(linkedList);
    }
}
