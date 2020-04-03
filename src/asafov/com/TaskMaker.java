package asafov.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskMaker {


    static String[] taskMaker(String[] source, int challengeId) {

        String ck = "DB "+challengeId;
        for (int i=0;i<source.length;i++){
            String str = source[i];
            if (str.contains("DB")){
                if (str.contains(ck)){
                    String[] a=str.split("//");
                    String debStr=a[0]+a[a.length-1];
                    int j=i-1;
                    while (source[j].contains("DB")){
                        j--;
                    }
                    source[j]=debStr;
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (int i=0;i<source.length;i++){
            if (!source[i].contains("DB")){
                list.add(source[i]);
            }
        }
        String[] res = new String[list.size()];
        for (int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] source = {"ans = 0",
                "for i in range(n):",
                "    for j in range(n):",
                "    //DB 3//for j in range(1, n):",
                "    //DB 2//for j in range(n + 1):",
                "        ans += 1",
                "return ans"};
        String[] res = taskMaker(source,3);
        System.out.println(Arrays.toString(res));
    }

}
