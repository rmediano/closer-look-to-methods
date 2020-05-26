package com.nearsoft.accessControl;

class Stack {
    /* Now, both stck and tos are private. This means
    that they cannot be accidentally or maliciously
    altered in a way that would be harmful to the stack.
    */
    private int[] stack = new int[10];
    private int index;

    // Initialize top-of-stack
    Stack() {
        index = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if(index ==9)
            System.out.println("Stack is full.");
        else
            stack[++index] = item;
    }

    // Pop an item from the stack
    int pop() {
        if(index < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stack[index--];
    }
}
