package DataStrucTure2;
//데크 변형
//기본 데크 구조에서 중간에 데이터를 추가하는 기능 구현
//단, 추가적인 자료구조 생성하지 말고 구현.

//입력 예시)
//초기 데크상태 (size : 5)
// -> 1, 2, 3, 4
//중간 입력 : 10
//결과 데크
//1, 2, 10, 3, 4


public class Deque_Practice3 {
    private class MyDeque2 {
        int[] arr;
        int front = 0;
        int rear = 0;

        MyDeque2(int size) {
            this.arr = new int[size + 1];
        }


        public boolean isEmpty() {
            return this.rear == this.front;
        }

        public boolean isFull() {
            return (this.rear + 1) % this.arr.length == this.front;
        }

        public void addFirst(int data) {
            if (this.isFull()) {
                System.out.println("Deque is Full!");
                return;
            }

            this.arr[this.front] = data;
            this.front = (this.front - 1 + this.arr.length) % this.arr.length;
        }

        public void addLast(int data) {
            if (this.isFull()) {
                System.out.println("Deque is Full!");
                return;
            }
            this.rear = (this.rear + 1) % this.arr.length;
            this.arr[this.rear] = data;
        }

        public Integer removeFirst() {
            if (this.isEmpty()) {
                System.out.println("Deque is empty!");
                return null;
            }

            this.front = (this.front + 1) % this.arr.length;
            return this.arr[this.front];
        }

        public Integer removeLast() {
            if (this.isEmpty()) {
                System.out.println("Deque is empty!");
                return null;
            }

            int data = this.arr[this.rear];
            this.rear = (this.rear - 1 + this.arr.length) % this.arr.length;
            return data;
        }

        public void printDeque() {
            int start = (this.front + 1) % this.arr.length;
            int end = (this.rear + 1) % this.arr.length;

            for (int i = start; i != end; i = (i + 1) % this.arr.length) {
                System.out.print(this.arr[i] + " ");
            }
            System.out.println();
        }

        public void addMiddle(int data) {
            if (this.isFull()) {
                System.out.println("Deque is Full!");
                return;
            }
            int elements = this.rear - this.front;
            if (elements < 0) {
                elements = this.arr.length + elements;
            }
            int mid = (this.rear - elements / 2 + this.arr.length) % this.arr.length + 1;

            int start = (this.rear + 1) % this.arr.length;
            int end = (this.rear - elements / 2 + this.arr.length) % this.arr.length;
            for (int i = start; i != end; i = (i - 1 + this.arr.length) % this.arr.length) {
                this.arr[i] = this.arr[(i - 1 + this.arr.length) % this.arr.length];
            }
            this.arr[mid] = data;
            this.rear = (this.rear + 1) % this.arr.length;

        }

    }

}
