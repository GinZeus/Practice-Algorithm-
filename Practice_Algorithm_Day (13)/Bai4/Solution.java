/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day13.BinaryPath;

/**
 *
 * @author datng
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  private void dfs(TreeNode node, String s, List<String> res) {
    s += node.val;

    if (node.left == null && node.right == null) {
      res.add(s);
      return;
    }
    s += "->";
    
    if (node.left != null) dfs(node.left, s, res);
    if (node.right != null) dfs(node.right, s, res);
  }

  public List<String> binaryTreePaths(TreeNode root) {
    var res = new ArrayList<String>();
    dfs(root, "", res) ;
    return res;
  }
}
