public class Solution {
    public int majorityElement(int[] nums) {
        
        int maj, count;
        
        maj = 0; 
        count = 1;
        
        for(int i=1; i<nums.length; i++)
        {
            
            if(nums[i] == nums[maj])
            {
                count++;
            }
            else
                count--;
            
            if(count == 0)
            {
                maj = i;
                count = 1;
            }
            
        }
        
        for(int j =0; j<nums.length; j++)
        {
            
            if(nums[j] == nums[maj])
            {
                count++;
            }
            
        }
        
        if(count>nums.length/2)
        {
            return nums[maj];
        }
            
        return 0;
    }
}
