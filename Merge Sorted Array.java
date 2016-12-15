public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        
        while(j<n)
        {
            if(nums1[i]>nums2[j])
            {
                for(k=m; k>i; k--)
                {
                    nums1[k] = nums1[k-1];
                }
                nums1[k] = nums2[j];
                i++;
                j++;
            }
            else
            {
                i++;
            }
            
        }
        
    }
}
