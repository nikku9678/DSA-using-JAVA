import java.util.*;

public class Basic_string {
    public static void main(String[] args){
        System.out.println("String ");

//        String name="Nikku";
//        String fullName="Nikku Kumar Das";
//        String sentence="My name is Nikku Kumar Das";
//        System.out.println(name);
//        System.out.println(fullName);
//        System.out.println(sentence);

        Scanner sc=new Scanner(System.in);
//        String name=sc.next();  // for only one word
//        String name2=sc.nextLine();

//        System.out.println(name);
//        System.out.println(name2);

        String fname="Nikku";
        String lname="Kumar Das";
        String fullname=fname+" "+lname;

        System.out.println(fullname);
        System.out.println(fullname.length());

        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
