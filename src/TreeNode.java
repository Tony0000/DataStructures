/**
 * Created by Antonio Manoel on 17/12/2016.
 */
public class TreeNode{

    private TreeNode parent;
    private TreeNode left;
    private TreeNode right;
    private int value;


    public TreeNode(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }

    public void setLeft(TreeNode parent, int value){
        this.parent = parent;
        left = new TreeNode(value);
    }

    public void setLeft(TreeNode newNode){
        this.left = newNode;
    }

    public void setRight(TreeNode parent, int value){
        this.parent = parent;
        right = new TreeNode(value);
    }

    public void setRight(TreeNode newNode){
        this.right = newNode;
    }

    public void setValue(int value){
        this.value = value;
    }

    public TreeNode getParent(){
        return parent;
    }

    public void setParent(TreeNode parent){
        this.parent = parent;
    }
}
