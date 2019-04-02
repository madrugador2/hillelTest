package org.oleksii.hillel.objectsAndCollection;

import java.util.Collection;

public class ObjectsAndCollection {
    
    public static <T> void Array2Collection(final T[] array, final Collection<T> collection) {
     
        for(int i = 0; i < array.length; i++) {
            
            collection.add(array[i]);
        }
    }    
}