package asafov.com;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentDigitSum {

    static int mostFrequentDigitSum(int n) {
        if (n==0) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        while (n>0){
            int num = n;
            int sum = 0;
            while (num>0){
                sum+=num%10;
                num=num/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            n=n-sum;
        }
        int number = 0;
        int freq = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()>freq){
                number=entry.getKey();
                freq=entry.getValue();
            }else if (entry.getValue()==freq && entry.getKey()>number){
                number=entry.getKey();
                freq=entry.getValue();
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int num = 88;
        System.out.println(mostFrequentDigitSum(num));
    }

}
