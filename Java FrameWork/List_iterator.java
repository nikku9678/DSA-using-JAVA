import java.util.ArrayList;
import java.util.ListIterator;

public class List_iterator {
    public static void main(String[] args){

        ArrayList<Integer> list= new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

//        System.out.println(list);
        list.add(40);
        list.add(60);

//        System.out.println(list);

        list.add(2,50);
        System.out.println(list);

        ListIterator<Integer> d= list.listIterator();

        while(d.hasNext()){  // iterate until the next item
            System.out.println(d.next());
        }

        while(d.hasPrevious()){  // iterate until the begin item came
            System.out.println(d.previous());
        }
    }
}
