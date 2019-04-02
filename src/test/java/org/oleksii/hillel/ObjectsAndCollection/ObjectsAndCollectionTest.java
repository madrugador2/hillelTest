package org.oleksii.hillel.ObjectsAndCollection;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Test;
import org.oleksii.hillel.objectsAndCollection.ObjectsAndCollection;

public class ObjectsAndCollectionTest {

    @Test
    public void test() {

        String[] array = {"void", "input", "void", "good", "lock" };
        Collection<String> collection = new HashSet<String>();

        ObjectsAndCollection.<String>Array2Collection(array, collection);

        for (String s: collection) {

            System.out.println(s);
        }
    }
}
