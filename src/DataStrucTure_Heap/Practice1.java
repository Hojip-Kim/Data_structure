package DataStrucTure_Heap;

import java.util.ArrayList;

//비선형자료구조 - 힙
//ArrayList로 최소 힙 구현
class MinHeap{
    ArrayList<Integer> heap;

    public MinHeap(){
        this.heap = new ArrayList<>();
        this.heap.add(0);
    }

    public void insert(int data){
        heap.add(data);

        int cur = heap.size() -1;

        while(cur > 1 && heap.get(cur/2) > heap.get(cur)){
            int parentVal = heap.get(cur/2);
            heap.set(cur/2 , )
        }

    }

}

public class Practice1 {
}
