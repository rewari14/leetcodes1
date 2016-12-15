public class Solution {
    public void moveZeroes(int[] nums) {
     
     int i=0;
     int j=0;
     int top=0;
     for(i=0; i<nums.length; i++)
     {
         if(nums[top] == 0)
         {
             for(j=top; j<nums.length-1;j++)
             {
                 nums[j] = nums[j+1];
             }
             nums[j] = 0;
             
         }
         else
         {
             top++;
         }
         
     }
        
    }
}
