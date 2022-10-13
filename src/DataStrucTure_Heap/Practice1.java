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

        while(cur > 1 && heap.get(cur/2) > heap.get(cur)){ // heap.get(cur/2) == 부모 인덱스.
            int parentVal = heap.get(cur/2);
            heap.set(cur/2 , data);
            heap.set(cur, parentVal); // 만약 부모데이터가 자식데이터보다 더 크면 부모데이터와 자식데이터를 바꾸는 코드임.

            cur/=2; // 위쪽으로 올라가서 다시 체크.
        }
    }

    public void printTree(){
        if(heap.isEmpty()){
            System.out.println("Empty place");
        }

        for (int i = 1; i < this.heap.size(); i++) {
            System.out.print(this.heap.get(i) + " ");
        }
        System.out.println();
    }

    public Integer delete(){
        if(this.heap.size() == 1){
            System.out.println("Heap is empty!");
            return null;
        }
        int target = heap.get(1); // 제일 작은수가 target에 저장.
        heap.set(1, heap.get(heap.size() -1)); // 가장 늦게 들어온 수가 minheap의 첫번째 인덱스로 copy.
        heap.remove(heap.size() -1); // 가장 늦게 들어온 수 delete

        int cur = 1;
        while(true){
            int leftIdx = cur*2;
            int rightIdx = cur*2 +1;
            int targetIdx = -1;

            if(rightIdx < heap.size()){ // 자식노드 둘다있는케이스
                targetIdx = heap.get(leftIdx) < heap.get(rightIdx) ? leftIdx : rightIdx;
            }
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {
        MinHeap minheap = new MinHeap();
        System.out.println("==데이터 삽입==");
        minheap.insert(30);
        minheap.insert(40);
        minheap.insert(10);
        minheap.printTree();
        minheap.insert(50);
        minheap.insert(60);
        minheap.insert(70);
        minheap.printTree();
        minheap.insert(20);
        minheap.printTree();
        minheap.insert(30);
        minheap.printTree();

    }
}
