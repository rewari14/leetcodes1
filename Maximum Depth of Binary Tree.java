/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        
        int lLength;
        int rLength;
        int k=0;
        
        if(root!= null)
        {
        
            if(root.left == null && root.right == null)
            {
                return 1;
            }
            
            else if(root.left == null)
            {
                return maxDepth(root.right) + 1;
            }
            else
            {
               rLength = maxDepth(root.right);
               lLength = maxDepth(root.left);
               
               k = (lLength>=rLength ? lLength : rLength) + 1;
               return k;
            }
        }
        return 0;
    }
}
