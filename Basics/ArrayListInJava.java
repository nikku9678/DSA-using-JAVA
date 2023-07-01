import java.util.ArrayList;
import java.util.List;
public class ArrayListInJava {
    public static void main(String[] args){
        /*ArrayList<String> studentName=new ArrayList<>();
        studentName.add("Nikku");
        studentName.add("Vishal");

        System.out.println(studentName);
        System.out.println(studentName.size());

        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);

        list.add(1,50);  // add element at index
        System.out.println(list);

        List<Integer> newList=new ArrayList();
        newList.add(150);
        newList.add(200);

        list.addAll(newList); // Append at the end of list
        System.out.println(list);

        System.out.println(list.get(2));  // get element at index 2*/

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        list.remove(2);   // Delete value at index
        System.out.println(list);

        list.remove(Integer.valueOf(40));  // Delete values
        System.out.println(list);


    }
}
