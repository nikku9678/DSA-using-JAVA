import java.util.*;


class queue{
    int f=-1,r=-1;
    int n=5;
    int[] a = new int[n];

    void Enqueue(Scanner sc){
        if(r==n-1){
            System.out.println("Queue overflow");
        }else{
            System.out.println("Enter the data to insert: ");
            int val=sc.nextInt();
            if(f==-1 && r==-1){
                f=0;
                r=0;
                a[r]=val;
            }else{
                r++;
                a[r]=val;
            }
        }
    }
    void Dequeue(){
        if(f==-1){
            System.out.println("Queue underflow");
        }else{
            int x=a[f];
            System.out.println("Deleted val: "+x);
            f++;
        }
    }
    void display(){
        if(f==-1 ){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Printing the queue value: ");
            for(int i=f; i<=r; i++){
                System.out.print(a[i]+ " ");
            }
            System.out.println("\n");
        }
    }
}
public class queue_using_Array {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        queue q=new queue();
        int t=1;
        while(t!=0){
            System.out.println("1. Insert the data\n2. Delete the Data\n3. Display\n Enter 0 to exit");
            int ch=sc.nextInt();
            switch(ch){
                case 1: q.Enqueue(sc);
                    break;
                case 2: q.Dequeue();
                    break;
                case 3:q.display();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
            t=ch;
        }

    }

}
