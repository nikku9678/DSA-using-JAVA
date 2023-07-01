import java.util.*;

public class Conditions {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        // If else if

//        int age=sc.nextInt();
//
//        if(age>18){
//            System.out.println("Adult");
//        }else{
//            System.out.println("Not adult");
//        }

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        if(a==b){
//            System.out.println("A is equal to b");
//        }else if(a>b){
//            System.out.println(" A is greater than B ");
//        }else{
//            System.out.println("B is greater than A");
//        }


//        int x=sc.nextInt();
//        if(x%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }


        // Switch Case ::

        int button=sc.nextInt();

        switch (button){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Default ");
                break;
        }
    }
}
