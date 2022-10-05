package DataStrucTure3;
//해시충돌 해결 - 개방 주소법(선형 탐사법)
public class MyHashTable2 extends MyHashTable {

    MyHashTable2(int size){
        super(size);
    }

    public void setValue(int key, int data){
        int idx = this.getHash(key);

        if(this.elemCnt == this.table.length){
            System.out.println("Hash table is full!!");
            return;
        }else if(this.table[idx] == null){
            this.table[idx] = data;
        }else{
            int newIdx = idx;
            while(true){
                newIdx = (newIdx +1) % this.table.length;
                if(this.table[newIdx] == null){
                    break;
                }
            }
            this.table[newIdx] = data;
        }
        elemCnt++;
    }
}


class Practice2{
    public static void main(String[] args) {
//        Test code
        MyHashTable2 ht = new MyHashTable2(5);
        ht.setValue(1, 1);
        ht.setValue(3, 3);
        ht.printHashTable();
//Hash Table
//0: null
//1: 1
//2: null
//3: 3
//4: null

        ht.setValue(1, 10);
        ht.printHashTable();
//Hash Table
//0: null
//1: 1
//2: 10
//3: 3
//4: null
        ht.setValue(1, 20);
        ht.setValue(1, 30);
        ht.setValue(1, 40);
        ht.printHashTable();
//Hash table is full!!
//Hash Table
//0: 30
//1: 1
//2: 10
//3: 3
//4: 20
    }
}