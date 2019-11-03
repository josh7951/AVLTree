/* Programmer: Joshua Mejia
 * COMP282 
 * Kaplan
 *  28 June 2019
 */
package SearchKeys;

public abstract class KeyedItem<KT extends Comparable<? super KT>> {
    private KT searchKey;
    
    public KeyedItem(KT key){
        searchKey = key;
    }
    
    public KT getKey(){
        return searchKey;
    }
}
