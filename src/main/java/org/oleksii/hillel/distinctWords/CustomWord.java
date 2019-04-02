package org.oleksii.hillel.distinctWords;

import java.util.Collection;
import java.util.HashSet;

public class CustomWord implements Comparable<CustomWord> {

    private String word;

    private final static Collection<Character> ignoreChars = new HashSet<Character>(){{

        add('.');
        add(',');
        add('/');
        add('-');
        add(';');
        add(':');
    }};

    public CustomWord(final String sWord) {

        this.word = sWord;
    }

    private static String convertWord(final String s) {

        StringBuffer sb = new StringBuffer(s);

        for (int i = 0; i < sb.length();) {

            Character chr = sb.charAt(i);

            if (ignoreChars.contains(chr)) {

                sb.deleteCharAt(i);
            }
            else {

                i++;
            }
        }

        return sb.toString().toLowerCase();
    }

    @Override
    public int compareTo(final CustomWord arg0) {

        return convertWord(this.getWord()).compareTo(convertWord(arg0.getWord()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((word == null) ? 0 : convertWord(word).hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        return compareTo((CustomWord) obj) == 0;
    }

    @Override
    public String toString() {

        return "CustomWord " + convertWord(word) + "[word=" + word + "]";
    }

    public String getWord() {

        return word;
    }
}
