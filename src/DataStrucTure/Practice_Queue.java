package DataStrucTure;



import java.util.Queue;
import java.util.LinkedList;

public class Practice_Queue {
    public static void main(String[] args) {


        Queue queue = new LinkedList(); // 사용하려면 이렇게 Linkedlist를 이용해서 사용하면됨.

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue); // [1, 2, 3, 4, 5]

        System.out.println(queue.poll()); // 1
        System.out.println(queue); // [2, 3, 4, 5]

        System.out.println(queue.poll()); // 2
        System.out.println(queue); // [3, 4, 5]

        System.out.println(queue.peek()); // 3
        System.out.println(queue); // [3, 4, 5]

        System.out.println(queue.contains(3)); // true
        System.out.println(queue.size()); // 3
        System.out.println(queue.isEmpty()); // false

        queue.clear();
        System.out.println(queue); // []
        System.out.println(queue.poll()); // null(예외발생을 안하고 null)


    }
}
