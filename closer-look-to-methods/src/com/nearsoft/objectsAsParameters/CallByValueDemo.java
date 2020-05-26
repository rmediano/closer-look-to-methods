package com.nearsoft.objectsAsParameters;

class TestValue {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValueDemo {
    public static void main(String[] args) {
        TestValue ob = new TestValue();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}
