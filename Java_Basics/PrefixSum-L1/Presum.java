import java.util.*;
public class Presum{
    public static void main(String[] args){
        int[] nums={2,4,1,5,3};
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]=sum+nums[i];
            sum=nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}