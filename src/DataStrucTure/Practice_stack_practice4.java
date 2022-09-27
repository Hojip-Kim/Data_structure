package DataStrucTure;

//두 문자열 비교
//단, #은 backspace로 바로 이전의 문자를 삭제하는 기능이라고 가정.

//입출력 예시
//입력: s1 = "tree", s2 = "th#ree"
//출력: true

//입력: s1 = "ab#a", s2 = "aab#"
//출력 : true

//입력 : s1 = "wo#w", s2 ="ww#o"
//출력 : false

import java.util.Stack;

public class Practice_stack_practice4 {
    public static boolean stringCompare(String s1, String s2){
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        String a1 = "";
        String b1 = "";
        boolean answer = true;

        for(String a : s1.split("")){
            if(a.equals("#")){
                stack1.pop();
            }else{
            stack1.push(a);}
        }

        System.out.println(stack1);
        for(String b : s2.split("")){
            if(b.equals("#")){
                stack2.pop();
            }else{
            stack2.push(b);}
        }
        System.out.println(stack2);

        int a = stack1.size();
        int b = stack2.size();
        for (int i = 0; i < a; i++) {
            a1 += stack1.pop();
        }
        for (int i = 0; i < b; i++) {
            b1 += stack2.pop();
        }

        if(a1.equals(b1)){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
//        Test code
        String s1 = "tree";
        String s2 = "th#ree";
        System.out.println(stringCompare(s1, s2));

        s1 = "ab#a";
        s2 = "aab#";
        System.out.println(stringCompare(s1, s2));

        s1 = "wo#w";
        s2 = "ww#o";
        System.out.println(stringCompare(s1, s2));
    }

}
