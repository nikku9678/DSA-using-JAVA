import java.util.*;
public class Learn_set {
    public static void main(String[] args){
        //Note: we cant set the value at index bcz it is unordered set
        /*Set<Integer> s =new HashSet<>();
        s.add(10);
        s.add(100);
        s.add(50);
        s.add(60);

        s.remove(50);
//        s.clear();
        int d=s.size();

        System.out.println(s.contains(17));
        System.out.println(d);
        System.out.println(s);*/


        // it maintain the ordered set
        /*Set<Integer> s =new LinkedHashSet<>();
        s.add(10);
        s.add(100);
        s.add(50);
        s.add(60);

        s.remove(50);
//        s.clear();
        int d=s.size();

        System.out.println(s.contains(17));
        System.out.println(d);
        System.out.println(s);*/



        // it maintain the element in sorted order
        Set<Integer> s =new TreeSet<>();   // (set+BST)
        s.add(10);
        s.add(100);
        s.add(50);
        s.add(60);

        s.remove(50);
//        s.clear();
        int d=s.size();

        System.out.println(s.contains(17));
        System.out.println(d);
        System.out.println(s);
    }
}
