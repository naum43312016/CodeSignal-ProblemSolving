package asafov.com.SpaceXinterviewQuestions;

import java.util.*;

public class PacketDescrambler {
    static String packetDescrambler(int[] seq, char[] fragmentData, int n) {
        String res = "";
        TreeMap<Integer, List<Character>> map = new TreeMap<>();
        for (int i=0;i<seq.length;i++){
            if (seq[i]>n) return "";
            if (map.containsKey(seq[i])){
                List<Character> l = map.get(seq[i]);
                l.add(fragmentData[i]);
                map.put(seq[i],l);
            }else {
                List<Character> l = new ArrayList<>();
                l.add(fragmentData[i]);
                map.put(seq[i],l);
            }
        }

        Set set = map.entrySet();


        Iterator it = set.iterator();
        int i=0;

        while(it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            int key = (int)me.getKey();
            if (i==0){
                if (key!=0) return "";
            }
            if (key-i > 1){
                return "";
            }
            i++;
            Map<Character,Integer> countMap = new HashMap<>();
            List<Character> list = (List<Character>)me.getValue();
            for (char ch : list){
                countMap.put(ch,countMap.getOrDefault(ch,0)+1);
            }
            boolean b=false;
            for (Map.Entry<Character,Integer> en : countMap.entrySet()){
                if (en.getValue()>(n/2)){
                    res=res+en.getKey();
                    b=true;
                    break;
                }
            }
            if (!b) return "";
        }
        if (res.length()>0){
            if (res.charAt(res.length()-1) != '#') return "";
        }
        return res;
    }

    public static void main(String[] args) {
        int[] seq ={0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};
        char[] f = {'#', '?', '?', '?', '?', '?', '?', '?','#','?','#','#'};
        System.out.println(packetDescrambler(seq,f,3));

    }

}
