package DataStrucTure;


import java.util.ArrayList;
import java.util.Stack;
//문자열 뒤집기

//입출력 예시
//입력 : "Hello"
//출력 : "OLLEH"

//입력 : 1 3 5 7 9
//출력 : 9 7 5 3 1
public class Practice_stack_practice {

    public static String reverseString(String str){
        String answer = "";
        Stack a = new Stack();
        for (int i = 0; i < str.length(); i++) {
            a.push(str.charAt(i));
        }
        int num = a.size();
        for (int i = 0; i < num; i++) {
            answer += a.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        String result = reverseString("Hello");
        System.out.println(result);

        String result2 = reverseString("1 3 5 7 9");
        System.out.println(result2);
    }
}


