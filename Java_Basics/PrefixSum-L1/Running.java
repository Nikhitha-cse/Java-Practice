import java.util.*;
public class Running{
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]=sum+nums[i];
            sum=nums[i];
  }
        System.out.println(Arrays.toString(nums));
    }
}