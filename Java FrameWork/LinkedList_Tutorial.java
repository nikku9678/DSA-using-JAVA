import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Tutorial {
    public static void main(String[] args){
        /* Note : All the operation are worked same as ArrayList */


        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(50);
        ll.add(350);


        ll.remove(2);

        int d=ll.get(1);
        ll.set(1,100);   // set value at index

//        ll.clear();  // clear all the elements from the linkedlist
        System.out.println(d);
        System.out.println(ll);


        System.out.println("Printing the linkedlist: ");
        for (int i=0; i<ll.size(); i++){
            System.out.print(ll.get(i)+" ");
        }
    }

}
