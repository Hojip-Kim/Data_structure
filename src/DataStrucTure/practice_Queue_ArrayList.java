package DataStrucTure;

import java.sql.Array;
import java.util.ArrayList;

public class practice_Queue_ArrayList {
    ArrayList list;
    practice_Queue_ArrayList(){
        this.list = new ArrayList();
    }

    public boolean isEmpty(){
        if(this.list.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(int data){
        this.list.add(data);
    }

    public Integer pop(){
        if(this.isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }

        int data = (int)this.list.get(0);
        this.list.remove(0);
        return data;

    }

    public Integer peek(){
        if(this.isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }


        return (int)this.list.get(0);
    }

    public void printQueue(){
        System.out.println(this.list);
    }
}

class Main2 {
    public static void main(String[] args) {

        practice_Queue_ArrayList myQueue = new practice_Queue_ArrayList();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);

        myQueue.printQueue(); // [1, 2, 3, 4, 5]

        System.out.println(myQueue.peek()); // 1
        myQueue.printQueue(); // [1, 2, 3, 4, 5]
        System.out.println(myQueue.pop()); // 1
        myQueue.printQueue(); // 2, 3, 4, 5
        System.out.println(myQueue.pop()); // 2
        myQueue.printQueue(); // 3, 4, 5

        System.out.println(myQueue.pop()); // 3
        System.out.println(myQueue.pop()); // 4
        System.out.println(myQueue.pop()); // 5
        myQueue.printQueue();
    }
}
