/* Programmer: Joshua Mejia
 * COMP282 
 * Kaplan
 *  28 June 2019
 */
package BinaryTree;

import java.util.LinkedList;
public class TreeIterator<T> implements java.util.Iterator<T> {
    private BinaryTreeBasis<T> binTree;
    private TreeNode<T> currentNode;
    private LinkedList <TreeNode<T>> queue;
    
    public TreeIterator(BinaryTreeBasis<T> bTree){
        binTree = bTree;
        currentNode = null;
        queue = new LinkedList <TreeNode<T>>();
    }
    @Override
    public boolean hasNext(){
        return !queue.isEmpty();
    }
    @Override
    public T next() throws java.util.NoSuchElementException{
        currentNode = queue.remove();
        return currentNode.item;
    }
    @Override
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    public void setPreorder(){
        queue.clear();
        preorder(binTree.root);
    }
    
    public void setInorder(){
        queue.clear();
        inorder(binTree.root);
    }
    
    public void setPostorder(){
        queue.clear();
        postorder(binTree.root);
    }
    
    private void preorder(TreeNode<T> treeNode) {
        if (treeNode != null){
            queue.add(treeNode);
            preorder(treeNode.leftChild);
            preorder(treeNode.rightChild);
        }
    }
    
    private void inorder(TreeNode<T> treeNode){
        if (treeNode != null){
            inorder(treeNode.leftChild);
            queue.add(treeNode);
            inorder(treeNode.rightChild);
        }
    }
    
    private void postorder(TreeNode<T> treeNode){
        if (treeNode != null){
            postorder(treeNode.leftChild);
            postorder(treeNode.rightChild);
            queue.add(treeNode);
        }
    }
}
