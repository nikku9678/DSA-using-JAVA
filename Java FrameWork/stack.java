import java.util.*;
public class stack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Stack<Integer>st=new Stack<>();
//        System.out.println("Enter the size of the stack: ");
//        int n=sc.nextInt();

//        for(int i=0; i<n; i++){
//            System.out.println("Enter the value: ");
//            int val=sc.nextInt();
//            st.push(val);
//        }

        st.push(100);
        st.push(300);
        int d=st.peek();
        System.out.println("Peek val :"+d);

        boolean f=st.contains(100);
        System.out.println(f);
        if(!st.empty()){
            st.pop();
        }

        int k=st.search(100);
        System.out.println(k);


        System.out.println("Printing the elements in the stack: ");
        for(int i=0; i<st.size(); i++){
            System.out.print(st.get(i)+" ");
        }
    }
}
