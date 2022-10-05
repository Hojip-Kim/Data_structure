package DataStrucTure3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//참고 - Hashtable? HashMap?
public class HashTable_Practice3 {
    public static void main(String[] args) {


//        Hashtable
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(0, 10);
        System.out.println(ht.get(0));

//        HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 10);
        System.out.println(hm.get(0));

        Map<Integer, Integer> map1 = ht;
        Map<Integer, Integer> map2 = hm;
        System.out.println(map1.get(0));
        System.out.println(map2.get(0));

//        ht.put(null, -999); // 에러발생(해시테이블에선 null을 이용한 키값을 적용시켜줄 수 없음.
        hm.put(null, -999);
        System.out.println(hm.get(null)); // -999 (해시맵에선 가능)

//        Hashtable과 HashMap 차이
//        공통 : 둘다 맵 인터페이스를 구현한 것.
//        차이 :
//        1. Key에 Null 사용 여부
//        2. Thread-safe
//        Hashtable : 쓰레드세이프 함.(멀티쓰레드환경에서 우수)
//        HashMap : (싱글쓰레드환경에서 우수함) - 주로 해시맵이 자주사용됨.
//        SynchronizedMap, ConcurrentHashMap을 이용하면 이 해시맵을 스레드세이프하게 사용가능.
    }
}
