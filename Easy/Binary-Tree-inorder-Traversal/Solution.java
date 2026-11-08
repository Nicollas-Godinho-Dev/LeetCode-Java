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
import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> resultado = new ArrayList<>();
    percorrer(root, resultado);
    return resultado;
  }

  private void percorrer(TreeNode no, List<Integer> lista) {
    if (no == null) {
      return;
    }

    percorrer(no.left, lista);

    lista.add(no.val);

    percorrer(no.right, lista);
  }
}