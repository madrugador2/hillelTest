package org.oleksii.hillel.synchronizedInADifferentWay;

public class IncrementSynchronize {

    private int value = 0;
    private Object lock = new Object();
    
    public int getNextValue1() {
        synchronized (lock) {
            value++;
        }

        return value;
    }

    public int getNextValue2() {
        synchronized (this) {
            value++;
        }

        return value;
    }

    public synchronized int getNextValue3() {

        value++;
        return value;
    }
}