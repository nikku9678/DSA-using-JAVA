public class Basic_LL {
    class Node{
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    };
    public Node head=null;

    public void insertAtFirst(int val){
        Node ptr= new Node(val);
        if(head==null){
            head=ptr;
            return;
        }

        ptr.next=head;
        head=ptr;
    }

    public void insertAtLast(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        if(head.next==null){
            head.next=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void insertAtBw(int val,int pos){
        Node newNode= new Node(val);

        if(pos==1){
            insertAtFirst(val);
        }
        Node temp=head;
        int i=1;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        temp.next=newNode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Basic_LL list=new Basic_LL();
        list.insertAtFirst(10);
        list.insertAtFirst(20);

        list.insertAtLast(30);
//      list.insertAtBw(40,2);
        list.display();
    }
}
