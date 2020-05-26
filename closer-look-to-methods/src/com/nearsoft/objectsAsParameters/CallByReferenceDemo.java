package com.nearsoft.objectsAsParameters;

class TestReference {
    int a, b;

    TestReference(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(TestReference o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class CallByReferenceDemo {
    public static void main(String[] args) {
        TestReference ob = new TestReference(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
