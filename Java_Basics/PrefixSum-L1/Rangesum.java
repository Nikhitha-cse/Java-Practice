import java.util.*;
public class Rangesum{
    public static void main(String[] args){
        int[] nums={3,1,4,2,5};
        int left=1;
        int right=3;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
              nums[i]=sum+nums[i];
              sum=nums[i];
            }

        System.out.println(nums[right]-nums[left-1]);
    }
}