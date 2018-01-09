/*This is the updated ones here*/

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        if(nums.length>0)
        {
            int a = nums[0];
            for(int i=0; i<nums.length-1; i++)
            {
                if(nums[i+1]-nums[i]<2)
                {
                }
                else
                {
                    for(int j=1; j<nums[i+1]-nums[i];j++)
                    {
                           l.add(nums[i]+j);
                    }
                }
            }
        }
        return l;
    }
}
