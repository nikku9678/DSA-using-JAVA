import java.util.*;

public class Functions {

    public static int Sum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static int Prod(int a,int b){
        return a*b;
    }

    public static int Factorial(int n){
        if(n<0){
            System.out.println("Invalid no");
            return -1;
        }
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }

        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();

//        int x= Sum(a,b);
//        int y=Prod(a,b);
//
//        System.out.println(y);

        int n=sc.nextInt();
        System.out.println("The factorial of "+n+" is "+ Factorial(n));
    }
}
