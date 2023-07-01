public class BST {
    static class Node{
        int data;
        Node left; 
        Node right;

         Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }


    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.right=insert(root.right,val);
        }else{
            root.left=insert(root.left,val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args){
        int[] values={5,2,3,4,7,9,12};
        Node root=null;

        for(int i=0; i<values.length; i++){
            root=insert(root,values[i]);
        }

        inorder(root);

    }
}
