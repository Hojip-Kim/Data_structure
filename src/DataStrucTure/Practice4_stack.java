package DataStrucTure;

import java.util.ArrayList;
import java.util.Stack;

class MyStack2 {
    int[] arr;
    int top = -1;

    MyStack2(int size) {
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (this.top == this.arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        if (this.isFull()) {
            System.out.println("Stack is full!");
            return;
        }

        this.top += 1;
        this.arr[this.top] = data;
    }

    public Integer pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        int data = this.arr[this.top];
        this.top -= 1;
        return data;
    }

    public Integer peek(){
        if (this.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return this.arr[this.top];
    }

    public void printStack(){
        for (int i = 0; i < this.top+1; i++) {
            System.out.println(this.arr[i] + " ");
        }
        System.out.println();
    }
}

class MyStack1 {
    ArrayList list;

    MyStack1() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        this.list.add(data);
    }

    public Integer pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        int data = (int) this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return data;
    }

    public Integer peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        int data = (int) this.list.get(this.list.size() - 1);
        return data;
    }

    public void printStack() {
        System.out.println(this.list);
    }

}


public class Practice4_stack {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack); // [1, 2, 3, 4, 5]

        System.out.println(stack.pop()); // 빼낼 데이터를 호출하면서 pop을 진행시킴. // 5
        System.out.println(stack); // [1, 2, 3, 4]

        stack.pop();
        System.out.println(stack); // [1, 2, 3]

        System.out.println(stack.peek()); // 가장 마지막에있는 3을 반환해줌.(빼내진 않음.)
        System.out.println(stack);

        System.out.println(stack.contains(1)); // true
        System.out.println(stack.size()); // 3
        System.out.println(stack.empty()); // false(비어있는지 안 비어있는지)

        stack.clear(); // 전부 지움.
        System.out.println(stack); // []


        System.out.println("=====================================");

        MyStack1 myStack = new MyStack1();
        System.out.println(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.printStack(); // 1, 2, 3, 4, 5

        System.out.println(myStack.pop()); // 5
        System.out.println(myStack.pop()); // 4
        myStack.printStack(); // 1, 2, 3

        System.out.println(myStack.pop()); // 3
        System.out.println(myStack.pop()); // 2
        System.out.println(myStack.pop()); // 1
        myStack.printStack();

        System.out.println("================================");

        MyStack2 myStack2 = new MyStack2(5);
        System.out.println(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.printStack(); // 1, 2, 3, 4, 5

        System.out.println(myStack.pop()); // 5
        System.out.println(myStack.pop()); // 4
        myStack.printStack(); // 1, 2, 3

        System.out.println(myStack.pop()); // 3
        System.out.println(myStack.pop()); // 2
        System.out.println(myStack.pop()); // 1
        myStack.printStack();

    }
}
