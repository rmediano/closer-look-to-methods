package com.nearsoft.objectsAsParameters;

// Objects may be passed to methods.
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        if(o.a == a && o.b == b){
            return true;
        }
        else {
            return false;
        }
    }
}

class PassingObjectsDemo {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        boolean isEqual = ob1.equalTo(ob2);
        System.out.println("ob1 == ob2: " + isEqual);

        isEqual = ob1.equalTo(ob3);
        System.out.println("ob1 == ob3: " + isEqual);
    }
}
