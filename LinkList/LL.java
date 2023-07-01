import java.util.*;

public class LL {
    class Node{
        int data;
        Node next;

         Node(int d){
            this.data=d;
            this.next=null;
        }
    };
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();

        list.addFirst(10);
        list.addLast(30);

        System.out.println(list.getLast());
        System.out.println(list);
    }
}
