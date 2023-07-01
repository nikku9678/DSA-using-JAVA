import java.util.*;

class array_List{
    public static void main(String[] args){

        /*ArrayList<String> studentName=new ArrayList<>();

        studentName.add("Nikku");
        studentName.add("Vishal");
        studentName.add("Ritik");

        System.out.println(studentName);*/

        ArrayList<Integer> list= new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        list.add(40);
        list.add(60);

        System.out.println(list);

        list.add(2,50);
        System.out.println(list);


        ArrayList<Integer> newList=new ArrayList<>();
        newList.addAll(list);

        System.out.println("New List: "+newList);

        list.remove(2);              // Remove element at index 2
        System.out.println(list);

        list.remove(Integer.valueOf(40));  // Remove 40
        System.out.println(list);

        // list.clear();                   // Clear the list

        list.set(2,1000); // update the value at index

        System.out.println(list);
        System.out.println(list.contains(60));  // return true or false

        for(int i=0; i<list.size(); i++){
            System.out.println(i+" -> "+ list.get(i));
        }

        for(Integer x: list){
            System.out.println(x);
        }

        Iterator it= list.iterator();

        while(it.hasNext()){
            System.out.println("Iterator -> "+it.next());
        }
    }
}