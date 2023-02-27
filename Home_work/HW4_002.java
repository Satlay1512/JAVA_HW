package Seminars.Home_work;
/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.LinkedList;

public class HW4_002 {
    public static void main(String[] args) {
        int[] listMas = {5,4,6,5,9,7,5,1};
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        System.out.println(linkList);

        enqueue(linkList, 9);
        System.out.println(linkList);

        System.out.println(dequeue(linkList));
        System.out.println(linkList);

        System.out.println(first(linkList));  
    }
    

    private static void enqueue(LinkedList<Integer> linkList, int num) {
        linkList.add(num);
    }
    

    private static int dequeue(LinkedList<Integer> linkList) {
        int num = 0;
        num = linkList.get(0);
        linkList.remove(0);
        return num;
    }
    

    private static int first(LinkedList<Integer> linkList) {
        int num = 0;
        num = linkList.get(0);
        return num;
    }
    
}
