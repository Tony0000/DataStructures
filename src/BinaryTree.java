/**
 * Created by Antonio Manoel on 17/12/2016.
 */
public class BinaryTree {

    private TreeNode root;

    public BinaryTree(int rootValue) {
        root = new TreeNode(rootValue);
    }

    public TreeNode getRoot(){ return root; }

    public void insert(int value) {
        insert(root, value);
    }

    public void insert(TreeNode parent, int value) {

        if (parent.getValue() > value) {
            if (parent.getLeft() != null)
                insert(parent.getLeft(), value);
            else
                parent.setLeft(parent, value);

        } else if (parent.getValue() < value) {
            if (parent.getRight() != null)
                insert(parent.getRight(), value);
            else
                parent.setRight(parent, value);

        }
    }

    public TreeNode remove(TreeNode node, int value) {

        if(node.getValue() < value) {           //look for the value in the right node
            node.setRight(remove(node.getRight(), value));
        } else if(node.getValue() > value) {    //look for the value in the left node
            node.setLeft(remove(node.getLeft(), value));
        } else {                                //found the node
            if(node.getRight() == null) {
                return node.getLeft();
            }
            if(node.getLeft() == null) {
                return node.getRight();
            }
            TreeNode temp = node;
            node = min(temp.getRight());
            node.setRight(deleteMin(temp.getRight()));
            node.setLeft(temp.getLeft());
        }
        return node;
    }

    private TreeNode min(TreeNode node) {
        if(node.getLeft() == null) {
            return node;
        } else {
            return min(node.getLeft());
        }
    }

    private TreeNode deleteMin(TreeNode node) {
        if(node.getLeft() == null) {
            return node.getRight();
        }
        node.setLeft(deleteMin(node.getLeft()));
        return node;
    }

    public void printInOrder(){
        printInOrder(root);
    }

    public void printInOrder(TreeNode parent){
        if (parent != null) {
            printInOrder(parent.getLeft());
            System.out.println("Traversed " + parent.getValue());
            printInOrder(parent.getRight());
        }
    }


    public int getDepth(){
        return getDepth(root);
    }

    public int getDepth(TreeNode parent){
        if(parent == null){
            return 0;
        }else{
            int leftDepth = getDepth(parent.getLeft());
            int rightDepth = getDepth(parent.getRight());

            if(leftDepth > rightDepth)
                return leftDepth + 1;
            else
                return rightDepth + 1;
        }
    }

    public int getMinValue(){
        TreeNode aux = root;
        while(aux.getLeft()!=null){
            aux = aux.getLeft();
        }
        return aux.getValue();
    }

    public int countNodes(){
        return countNodes(root);
    }

    public int countNodes(TreeNode parent){
        if(parent == null){
            return 0;
        }else{
            return 1 + countNodes(parent.getLeft())+ countNodes(parent.getRight());
        }
    }

    public int getMaxValue(){
        TreeNode aux = root;
        while(aux.getRight()!=null){
            aux = aux.getRight();
        }
        return aux.getValue();
    }
}
