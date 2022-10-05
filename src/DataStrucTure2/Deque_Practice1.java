package DataStrucTure2;

//데이터 재정렬
//D_0 -> D_1 -> ... -> D_n-1 -> D_n 순으로 되어있는 데이터를
//D_0 -> D_n -> D_1 -> D_n-1 -> ... 순이 되도록 재정렬 하시오.

//입력 예시)
//입력 데이터 : 1 -> 2 -> 3 -> 4 -> 5
//출력 데이터 : 1 -> 5 -> 2 -> 4 -> 3


import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Practice1 {
    public static void reorderData(int[] arr){

        Deque<Integer> deque = new ArrayDeque();
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            deque.add(arr[i]);
        }
        int num = deque.size();
        for(int i = 0; i<num; i++){
            if(i % 2 == 1){
                arr2[i] = deque.removeLast();}
            else if(i % 2 == 0){
                arr2[i] = deque.removeFirst();
            }
        }
        for(int item : arr2){
            System.out.print(item + " ");
        }
        System.out.println();

    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        reorderData(arr);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        reorderData(arr2);

    }
}
