import java.util.*;
public class priority_Queue {
    public static void main(String[] args){
        // Minheap
        /*Queue<Integer> q = new PriorityQueue<>();

        q.offer(10);
        q.offer(200);
        q.offer(30);
        q.offer(24);

        System.out.println(q);

        int k=q.poll();
        System.out.println(k);
        System.out.println(q);*/


        // Maxheap in priority queue
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());  // Minheap

        q.offer(10);
        q.offer(200);
        q.offer(30);
        q.offer(24);

        System.out.println(q);

        int k=q.poll();
        System.out.println(k);
        System.out.println(q);


    }

}
