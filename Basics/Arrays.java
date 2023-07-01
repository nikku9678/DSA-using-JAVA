import java.util.*;

public class Arrays {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int[] a=new int[3];
        int sum=0;
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n"+sum);
    }
}
