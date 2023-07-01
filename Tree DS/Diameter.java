/*public class Diameter {
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

    public static int height(Node root){
        if(root==null)  return 0;

       int leftHeight=height(root.left);
       int rightHeight=height(root.right);

       int myHeight=Math.max(leftHeight,rightHeight)+1;

       return myHeight;
    }

    // Time Complexity O(n*2)
    public static int diameter(Node root){
        if(root==null) return 0;

        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;

        return Math.max(diam1,Math.max(diam2,diam3));  
    }
    public static void main(String[] args){
        int [] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTree(arr);

        int x=diameter(root);
        System.out.println(x);
    }
    */



// Time Conplexity O(n);
public class Diameter {
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
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter(Node root){
        if(root==null) {
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter(root.left);
        TreeInfo right=diameter(root.right);

        int myHeight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        
        int myDiam=Math.max(diam1,Math.max(diam2,diam3));
        
        TreeInfo myInfo=new TreeInfo(myHeight,myDiam);
        return myInfo;
    }
    public static void main(String[] args){
        int [] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTree(arr);

        int x=diameter(root).diam;
        System.out.println(x);
    }
}












