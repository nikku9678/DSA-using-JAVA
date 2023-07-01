import java.util.*;

public class Tree {
     static class Node{
        int data;
        Node left;
        Node right;

        public Node(int d){
            data=d;
            left=null;
            right=null;
        }
    }
    static class BinaryTree{
         static int idx=-1;
        public  Node buildTree(int [] arr){
            idx++;
            if(arr[idx]==-1){
                return null;
            }

            Node newNode = new Node(arr[idx]);
             newNode.left= buildTree(arr);
             newNode.right= buildTree(arr);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrderTraversal(Node root){
        if(root==null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            
            if(currNode==null){
                System.out.println("\n");
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                } 
            }
        }
    }
    public static void main(String[] args){
        int [] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTree(arr);
        // preorder(root);
        // System.out.println("\n");
        // inorder(root);
        // System.out.println("\n");
        // postorder(root);
        // System.out.println("\n");
        levelOrderTraversal(root);

    }
}
