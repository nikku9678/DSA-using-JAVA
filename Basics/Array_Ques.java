import java.util.*;


public class Array_Ques {
    // Linear Search
    public static boolean search(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static int BinarySearch(int arr[],int key){
        int l=0,h=arr.length;

        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        // Taking input
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key to search: ");
        int key=sc.nextInt();

//        if(search(arr,key)){
//            System.out.println("Present");
//        }else{
//            System.out.println("Not Present");
//        }

        System.out.println(BinarySearch(arr,key));

    }
}
