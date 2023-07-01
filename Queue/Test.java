import java.util.*;

public class Test {
    public static void main(String[] args){
        int[] nums= {2,7,11,15};
        int target=9;
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
            System.out.println(nums[i]+" "+i);
        }

        for(int i=0; i<nums.length; i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                int index=map.get(rem);
                System.out.println(i+ " "+ index);

                if(index==i) continue;

                System.out.println(new int[]{i,index});
            }
        }

    }
}
