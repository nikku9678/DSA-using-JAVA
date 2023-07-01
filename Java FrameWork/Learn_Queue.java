import java.util.*;
public class Learn_Queue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();  // queue using linkedlist

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(24);

        System.out.println("Print front ele: "+q.peek());
        System.out.println(q);

        q.poll();  // pop the element from the front side
        System.out.println(q);


    }

}
