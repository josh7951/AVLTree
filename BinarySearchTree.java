/* Programmer: Joshua Mejia
 * COMP282 
 * Kaplan
 *  28 June 2019
 */
package BinaryTree;

import SearchKeys.KeyedItem;
public class BinarySearchTree <T extends KeyedItem<KT>,  
        KT extends Comparable<? super KT>> extends BinaryTreeBasis{

        public BinarySearchTree(){
            
        }
        
        public BinarySearchTree(T rootItem){
            super(rootItem);
        }
}
