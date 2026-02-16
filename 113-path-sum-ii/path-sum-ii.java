import java.util.*;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(TreeNode node, int targetSum,
                           List<Integer> current,
                           List<List<Integer>> result) {
        if (node == null) return;

        current.add(node.val);

        if (node.left == null && node.right == null && targetSum == node.val) {
            result.add(new ArrayList<>(current));
        } else {
            backtrack(node.left, targetSum - node.val, current, result);
            backtrack(node.right, targetSum - node.val, current, result);
        }

        current.remove(current.size() - 1); // backtrack
    }
}
