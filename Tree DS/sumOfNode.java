public class sumOfNode {
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

    public static int treeNodeSum(Node root){
        if(root==null) return 0;

        int leftSum=treeNodeSum(root.left);
        int rightSum=treeNodeSum(root.right);

        return leftSum+rightSum+root.data;
    }
    public static void main(String[] args){
        int [] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTree(arr);

        int x=treeNodeSum(root);
        System.out.println(x);
    }
}

