/* Programmer: Joshua Mejia
 * COMP282 
 * Kaplan
 *  28 June 2019
 */
package BinaryTree;

public abstract class BinaryTreeBasis<T> {
    protected TreeNode<T> root;
    
    public BinaryTreeBasis(){
        root = null;
    }
    
    public BinaryTreeBasis(T rootItem){
        root = new TreeNode<T>(rootItem, null, null);
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public void makeEmpty() {
        root = null;
    }
    
    public T getRootItem() throws TreeException {
        if (root == null) {
            throw new TreeException("Empty Tree");
        }
        else{
            return root.item;
        }
    }
    
    public abstract void setRootItem(T newItem);
}
