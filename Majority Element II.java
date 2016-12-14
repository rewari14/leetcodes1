public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        Arrays.sort(nums);
        int a, count=0;
        if(nums.length>0)
        {
            a = nums[0];
            
            for(int i=0; i<nums.length; i++)
            {
                if(nums[i] == a)
                {
                    count++;
                }
                
                if(nums[i] != a)
                {
                    a = nums[i];
                    count = 1;
                }
                 
                if(count > nums.length/3)
                {
                    if(!l.contains(a))
                    {
                        l.add(a);
                    }
                }
                
            }
            
        }   
        return l;
    }
}
