package org.oleksii.hillel.distinctWords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class DistinctWords implements Iterable<CustomWord> {

    private Scanner scanner;
    private HashSet<CustomWord> words;
    
    public DistinctWords(final String filePath) throws FileNotFoundException {
        
        scanner = new Scanner(new File(filePath));       
        words = new HashSet<CustomWord>();
    }

    @Override
    public Iterator<CustomWord> iterator() {

        return new CustomWordIterator();
    }
    
    private CustomWord ScanNext() {
        
        CustomWord nextWord = null;
        
        while(scanner.hasNext()) {

            String s = scanner.next();
            CustomWord scanWord = new CustomWord(s); 
            
            if(words.add(scanWord)) {
                
                nextWord = scanWord;
                break;
            }
        }
        
        return nextWord;
    }
    
    private class CustomWordIterator implements Iterator<CustomWord> {
        
        private CustomWord current; 
          
        public boolean hasNext() { 

            current = ScanNext();
            return current != null;
        } 
          
        public CustomWord next() {

            return current; 
        } 
    }    
}