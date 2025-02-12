public class TreeNode<T> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
        value = data;
        this.left = left;
        this.right = right;
    }
}