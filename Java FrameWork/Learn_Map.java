import java.util.*;
public class Learn_Map {
    public static void main(String[] args) {
        // Key value pair
        Map<Integer,String> m = new HashMap<>();
        m.put(1,"Nikku");
        m.put(2,"Vishal");
        m.put(3,"Vishal");
        m.put(4,"Ritik");

//        Note : if same key used then their value overwrite
//        m.put(2,"Suman");  // overWRITE : 2 = Suman

        m.putIfAbsent(2, "Suman");  //it will not overwrite if value present against 2

        m.remove(3);
        System.out.println(m.isEmpty());  // check empty or not
        System.out.println(m);

        // Print all the keys:
        for(Integer d: m.keySet()){
            System.out.println(d);
        }

        // Print all the elements:
        for(String k: m.values()){
            System.out.println(k);
        }

    }
}