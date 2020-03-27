package asafov.com;

import java.util.*;

public class AllLongestStrings {

    static String[] allLongestStrings(String[] inputArray) {
        if (inputArray.length==0) return new String[]{};
        List<String> strings = new ArrayList<>();
        int max = inputArray[0].length();
        strings.add(inputArray[0]);
        for (int i=1;i<inputArray.length;i++){
            if (inputArray[i].length()>max){
                max = inputArray[i].length();
                strings.clear();
                strings.add(inputArray[i]);
            }else if(inputArray[i].length()==max){
                strings.add(inputArray[i]);
            }
        }
        String[] ans = new String[strings.size()];
        strings.toArray(ans);
        return ans;
    }

    public static void main(String[] args) {
        String[] s = {"aba", "aa", "ad", "vcd", "aba"};
        String[] ans = allLongestStrings(s);
        System.out.println(Arrays.toString(ans));
    }

}
