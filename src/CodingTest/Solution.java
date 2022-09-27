package CodingTest;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        String answer = "";


        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<s.length(); i++)
        {
            arr.add((int)s.charAt(i));
        }

        System.out.println(arr);
        return answer;
    }
}

class Main {

    public static void main(String[] args){
        Solution a = new Solution();


        System.out.println(a.solution("1 3 2 4 5"));

    }
}
