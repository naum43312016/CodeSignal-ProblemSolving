package asafov.com;

import java.util.LinkedList;
import java.util.List;

public class ReverseInParentheses {



    static String reverseInParentheses(String inputString){
        if (inputString==null || inputString.length()==0) return "";
        List<Character> list = new LinkedList<>();
        for (char c : inputString.toCharArray()){
            list.add(c);
        }
        rec(list);
        StringBuilder s = new StringBuilder();
        for (char ch : list){
            s.append(ch);
        }
        return s.toString();
    }

    static void rec(List<Character> list){
        if (!list.contains('(')) return;
        int end = indexOfLasParCl(list);
        int start = indexOfLasParOp(list,end);
        removeParAndReverse(list,start,end);
        System.out.println(list.toString());
        rec(list);
    }
    static void removeParAndReverse(List<Character> list,int start,int end){
        int i = start+1;
        int j = end-1;
        while (i<=j){
            //swap
            char c = list.get(i);
            list.set(i,list.get(j));
            list.set(j,c);
            i++;
            j--;
        }
        list.remove(start);
        list.remove(end-1);
    }
    static int indexOfLasParCl(List<Character> list){
        int ans = 0;
        for (int i =0;i<list.size();i++){
            if (list.get(i)==')'){
                return i;
            }
        }
        return ans;
    }
    static int indexOfLasParOp(List<Character> list,int end){
        int ans = 0;
        for (int i =0;i<end;i++){
            if (list.get(i)=='('){
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseInParentheses("foo(bar(baz))blim"));
    }
}
