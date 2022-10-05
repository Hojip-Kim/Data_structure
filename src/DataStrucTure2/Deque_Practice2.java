package DataStrucTure2;
// 팰린드롬찾기(앞뒤문자가 같은것)
// 입출력 예시)
// 입력 : a
// 결과 : true

// 입력 : madam
// 결과 : true

import java.util.ArrayDeque;
import java.util.Deque;

//입력 : abab
// 결과 : false
public class Deque_Practice2 {

    public static boolean checkPalindrome(String str){
//        나의 답안
//        boolean answer = true;
//        Deque<Character> deque = new ArrayDeque();
//
//        for (int i = 0; i < str.length(); i++) {
//            deque.add(str.charAt(i));
//        }
//        while(true){
//            if(deque.getFirst() == deque.getLast()){
//                deque.removeFirst();
//                if(!deque.isEmpty()){
//                deque.removeLast();}else{break;}
//            }else{
//                answer = false;
//                break;
//            }
//            if(deque.size() == 0){
//                break;
//            }
//        }
//        return answer;
        Deque deque = new ArrayDeque();
        boolean isFront = true;
        boolean isPalindrome = true;

        for(String s: str.split("")){
            deque.addFirst(s);
        }

        while(!deque.isEmpty()){
            String s1 = (String)deque.pollFirst(); // poll = 없으면 null반환. remove는 예외처리시킴.
            String s2 = (String)deque.pollLast();

            if(s1 != null && s2 != null && s1.equals(s2)){
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
//        Test code
        System.out.println(checkPalindrome("a")); // true
        System.out.println(checkPalindrome("aba")); // true
        System.out.println(checkPalindrome("abba")); // true
        System.out.println(checkPalindrome("abab")); // false
        System.out.println(checkPalindrome("abcba")); // true
        System.out.println(checkPalindrome("abccba")); // true
        System.out.println(checkPalindrome("madam")); // true
    }
}
