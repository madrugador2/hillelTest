package org.oleksii.hillel.distinctWords;

import java.io.FileNotFoundException;
import java.util.Iterator;

import org.junit.Test;

public class DistinctWordsTest {

    @Test
    public void test() throws FileNotFoundException  {

        // put correct path here
        DistinctWords distinctWords = new DistinctWords("C:\\Documents and Settings\\oleksii.riumin\\eclipse-workspace\\hillelTest\\src\\main\\resources\\big.txt");       
        Iterator<CustomWord> iterator = distinctWords.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
