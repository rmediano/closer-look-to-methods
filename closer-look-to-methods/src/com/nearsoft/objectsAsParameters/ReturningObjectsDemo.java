package com.nearsoft.objectsAsParameters;

class TestReturning {
    int a;
    TestReturning(int i) {
        a = i;
    }
    TestReturning incrByTen() {
        TestReturning temp = new TestReturning(a+10);
        return temp;
    }
}

public class ReturningObjectsDemo {
    public static void main(String args[]) {
        TestReturning ob1 = new TestReturning(2);
        TestReturning ob2;
        ob2 = ob1.incrByTen();

        System.out.println("ob1.a: " + ob1.a);

        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
    }
}

class AccessModifiers {
    private int num;

    protected int getNum(){
        return num;
    }
}
