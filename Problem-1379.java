/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
	TreeNode target, res;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
		this.target = target;
		inorder(original,clone);
		return res;
    }
	public void inorder(TreeNode original, TreeNode clone){
		inorder(original.left, clone.left);
		if(original == target) res = clone;
		inorder(original.right, clone.right);
	}
}
