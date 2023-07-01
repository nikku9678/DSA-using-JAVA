import java.util.*;

public class Question_loop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

    // Find sum 1 to n

//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=1; i<=n; i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);

        // Print table

        int n=sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }

    }
}
