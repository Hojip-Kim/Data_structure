package DataStrucTure2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        MyDeque1 myDeque = new MyDeque1();


//        Front 부분 입력
        myDeque.addFirst(1);
        myDeque.addFirst(2);
        myDeque.addFirst(3);
        myDeque.printDeque(); // 3, 2, 1
//        Rear 부분 입력
        myDeque.addLast(10);
        myDeque.addLast(20);
        myDeque.addLast(30);
        myDeque.printDeque(); // 3, 2, 1, 10, 20, 30
//        Front 부분 출력
        System.out.println(myDeque.removeFirst()); // 3
        myDeque.printDeque(); // 2, 1, 10, 20, 30

//        Rear 부분 출력
        System.out.println(myDeque.removeLast()); // 30
        myDeque.printDeque(); // 2, 1, 10, 20

        System.out.println(myDeque.removeLast()); // 20
        System.out.println(myDeque.removeLast()); // 10
        System.out.println(myDeque.removeLast()); // 1
        System.out.println(myDeque.removeLast()); // 2
        myDeque.printDeque(); //

    }
}
