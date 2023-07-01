import java.util.*;

class queue_LL{
    public class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
    Node f=null;
    Node r=null;

    void push(Scanner sc){
        int val=sc.nextInt();
        Node newNode= new Node(val);
        if(f==null && r==null){
            f=newNode;
            r=newNode;
        }
        else{
            r.next=newNode;
            r=newNode;

        }
    }

    void pop(){
        if(f==null){
            System.out.println("Queue Underflow");
        }
        else{
            int x=f.data;
            System.out.println("Deleted value: "+x);
            f=f.next;
        }
    }
    void display(){
        Node temp=f;
        System.out.println("\nPrinting the value: ");
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }


}
public class queue_using_LinkedList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        queue_LL qL= new queue_LL();
        int t=1;
        while(t!=0){
            System.out.println("1. Insert the data\n2. Delete the Data\n3. Display\n Enter 0 to exit");
            int ch=sc.nextInt();
            switch(ch){
                case 1: qL.push(sc);
                    break;
                case 2: qL.pop();
                    break;
                case 3:qL.display();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
            t=ch;
        }

    }
}
