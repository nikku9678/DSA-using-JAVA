import java.util.*;

class cqArray{
    int n=5;
    int[] a=new int[n];
    int f=-1,r=-1;

    void insert(Scanner sc){

        if(f==(r+1)%n){
            System.out.println("Queue overflow");
        }
        else {
            System.out.println("Enter the val to insert: ");
            int val=sc.nextInt();
            if(f==-1){
                f=0;
                r=0;
                a[r]=val;
            }
            else{
                r=(r+1)%n;
                a[r]=val;
            }
        }
    }
    void del(){
        if(f==-1 && r==-1){
            System.out.println("Queue Undeflow");

        }
        else if(f==r){
            f=-1;
            r=-1;
        }
        else{
            int x=a[f];
            System.out.println("Deleted val: "+x);
            f=(f+1)%n;
        }
    }
    void display(){
        System.out.println("Printing the elements: ");
        int i;
        for(i=f; i!=r; i=(i+1)%n){
            System.out.println(a[i]+ " ");
        }
        System.out.println(a[i]);
    }
}
public class Circular_queue_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        cqArray cq= new cqArray();
        int t=1;
        while(t!=0){
            System.out.println("1. Insert the data\n2. Delete the Data\n3. Display\n Enter 0 to exit");
            int ch=sc.nextInt();
            switch(ch){
                case 1: cq.insert(sc);
                    break;
                case 2: cq.del();
                    break;
                case 3:cq.display();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
            t=ch;
        }

    }
}
