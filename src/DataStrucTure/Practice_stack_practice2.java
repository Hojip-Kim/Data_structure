package DataStrucTure;

import java.util.Stack;

public class Practice_stack_practice2 {
    public static void checkParenthesis(String str){
        Stack a = new Stack();

        boolean checkFlag = true;

        for(String b : str.split("")){
            if(b.equals("(")){
                a.push(b);
            }else{
                if(a.isEmpty()){
                    checkFlag = false;
                    break;
                }else{
                    a.pop();
                }
            }
           if(a.isEmpty()){
               checkFlag = true;
           }else{
               checkFlag = false;
           }
        }
        if(checkFlag){
            System.out.println("PASS!");
        }else{
            System.out.println("FAIL!");
        }

    }

    public static void main(String[] args) {
//        Test code
        checkParenthesis("(");      //FAIL!
        checkParenthesis(")");      //FAIL!
        checkParenthesis("()");     //PASS!
        checkParenthesis("()()()"); //PASS!
        checkParenthesis("(())()"); //PASS!
        checkParenthesis("(((()))");//FAIL!
    }
}
