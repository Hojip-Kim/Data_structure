package DataStrucTure;

//practice3
//후위표기법 연산
//참고 설명) 전위, 중위, 후위 표기법

//입출력 예시)
//입력 : "2 2 +"
//출력 : 4

import java.util.Stack;

//입력 : "2 2 -"
//출력 : 0
public class Practice_stack_practice3 {
    public static double calculate(String string){
        double answer = 0;
        Stack stack = new Stack();


        for(String a : string.split(" ")){
            stack.push(a);
        }
        if(stack.peek().equals("+")){
            stack.pop();
           answer = Integer.parseInt((String)stack.pop()) + Integer.parseInt((String)stack.pop());
        }else if(stack.peek().equals("-")){
            stack.pop();
            answer = Integer.parseInt((String)stack.pop()) - Integer.parseInt((String)stack.pop());
        }else if(stack.peek().equals("*")){
            stack.pop();
            answer = Integer.parseInt((String)stack.pop()) * Integer.parseInt((String)stack.pop());
        }else if(stack.peek().equals("/")){
            stack.pop();
            answer = Integer.parseInt((String)stack.pop()) / Integer.parseInt((String)stack.pop());
        }


        return answer;
    }

    public static void main(String[] args) {
//        Test Code
        System.out.println(calculate("2 2 +"));
        System.out.println(calculate("2 2 -"));
        System.out.println(calculate("2 2 *"));
        System.out.println(calculate("2 2 /"));
    }

}
